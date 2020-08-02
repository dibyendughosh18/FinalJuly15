package com.controller;

import com.dto.Coresponse;
import com.dto.Header;
import com.dto.History;
import com.dto.Letter;
import com.dto.RequestDto;
import com.dto.UserDto;
import com.service.FilterData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.RequestService;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestController {//1

	
	@Autowired
	RequestService requestService;
	
	
	@RequestMapping(value = "/request")
	public ModelAndView  getRequestData(@ModelAttribute("requestDto")RequestDto requestDto, HttpServletRequest request) {//2
		
		ModelAndView mv = new ModelAndView();
		
		/*PagedListHolder<Header> headerList = new PagedListHolder<Header>();
		PagedListHolder<Coresponse> coresponseList = new PagedListHolder<Coresponse>();
		PagedListHolder<History> historyList = new PagedListHolder<History>();*/
		
		request.getSession().setAttribute("dataTag", 0);
		
		/*if(page == null) {*/
		String ssn = requestDto.getSSN();
		String processYear = requestDto.getProcess_year();
		String locationId = requestDto.getLocation_id();
		String uid = requestDto.getUid();
		
		if(ssn != null && ssn.length() > 0 && processYear != null && processYear.length() > 0 && locationId != null && locationId.length() > 0 && uid != null && uid.length() > 0){
		
        /*rows return from header query*/
		
		List<Header> listHeader = requestService.getHeadRequest(requestDto);
		
		/*adding field from new query to header object*/
		
		List<History> listSubFile = requestService.getSubFileRequest(requestDto);
		String subFile = null;
		/*getting subfile from the new query return list*/
		if(listSubFile.size() > 0){
			subFile = listSubFile.get(0).getProcess_code();
		}
		
		/*setting subfile in the header object*/
		if(listHeader.size() > 0){
		for(Header header : listHeader){
			header.setSub_file2(subFile);
		}
		}
		/*rows return from coresponse query*/
		
		List<Coresponse> listCoresponse = requestService.getCorRequest(requestDto);
		
		/*rows return from history query*/
		
		List<History> listHistoty = requestService.getHisRequest(requestDto);
		
		//model.addAttribute("headers",requestService.getRequest(requestDto) );
		//List<Coresponse> coresponse = requestService.getCorRequest(requestDto);
		//model.addAttribute("Coresponses",requestService.getCorRequest(requestDto));
        //model.addAttribute("history",requestService.getHisRequest(requestDto));
		
		FilterData filter = new FilterData();
		List<Letter> letters = filter.dataToFilter();
		
		UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
		// If User is IDND
		
		if(userDto != null){
		if(userDto.getName().equalsIgnoreCase("IDND"))
		{
		for (Letter letter:letters) {
			for(Coresponse cor:listCoresponse){
				
				if (letter.getLetter_name().equalsIgnoreCase(cor.getCoresponse_type())){
					
				     if (letter.getProcess_year().equalsIgnoreCase(requestDto.getProcess_year())){
				 
					    if (!letter.getPrint_name_prg().equalsIgnoreCase("NONE")) {
						     
					    	//set A HEF indicator = 1  print < A HERF > tag  ;
					    	  cor.setA_HREF_indicator("1");
					    	  request.getSession().setAttribute("letterDto", letter);
					    	  
							 break;
					} else{
						
						//set A HEF indicator = 0  Don't print < A HERF > tag
				    	  cor.setA_HREF_indicator("0");
							 break;
					}
		  
		         }
			  }
				
		     /* if( letter.getLetter_name().equalsIgnoreCase("LAST RECORD"))
			   {//4
				    // no match to cor.getCoresponse_type()
					
				//set A HEF indicator = 0  Don't print < A HERF > tag
		    	  cor.setA_HREF_indicator("0");
				break;
			   }//4
*/		      
			  
		}
		}
		
		
	    }
		
		}
           /* headerList.setSource(listHeader);
            coresponseList.setSource(listCoresponse);
            historyList.setSource(listHistoty);
            headerList.setPageSize(1);
            coresponseList.setPageSize(listCoresponse.size());
            historyList.setPageSize(listHistoty.size());*/
           
            if(listCoresponse.size()> 0|| listHistoty.size() > 0){
            if(listCoresponse.size() > listHistoty.size()){
            	request.getSession().setAttribute("printedList", listCoresponse);
    		}else{
    			request.getSession().setAttribute("printedList", listHistoty);
    		}
            }
            
            request.getSession().setAttribute("headerList", listHeader);
            request.getSession().setAttribute("coresponseList", listCoresponse);
            request.getSession().setAttribute("historyList", listHistoty);
            request.getSession().setAttribute("requestDto", requestDto);
            
            if(listHistoty.size() > 0 && listHeader.size() > 0){
            	if(listHeader.get(0).getPrss_code().equals(listHistoty.get(0).getProcess_code())){
            		
            		request.getSession().setAttribute("dataTag", 1);
            	}
            }
            
            mv.setViewName("display");
	        return mv;
      
		}else{
			mv.setViewName("requestInfo");
	        return mv;
		}
		/*}else{
			    if(page.equals("prev")) {
	        	for getting previous page
	        	
	        	headerList = (PagedListHolder<Header>)request.getSession().getAttribute("headerList");
	        	coresponseList = (PagedListHolder<Coresponse>)request.getSession().getAttribute("coresponseList");
	        	historyList = (PagedListHolder<History>)request.getSession().getAttribute("historyList");
	           
	        
	        		if(historyList.getPageCount() > 0){
	                	if(headerList.getPageList().get(0).getPrss_code().equals(historyList.getPageList().get(0).getProcess_code())){
	                		
	                		request.getSession().setAttribute("dataTag", 1);
	                	}
	                }
	        
	        	headerList.previousPage();
	        	coresponseList.previousPage();
	        	historyList.previousPage();
	        }else if(page.equals("next")) {
	        	for getting next page
	        	
	        	headerList = (PagedListHolder<Header>)request.getSession().getAttribute("headerList");
	        	coresponseList = (PagedListHolder<Coresponse>)request.getSession().getAttribute("coresponseList");
	        	historyList = (PagedListHolder<History>)request.getSession().getAttribute("historyList");
	            
	        	headerList.nextPage();
	        	coresponseList.nextPage();
	        	historyList.nextPage();
	        }else {
	        	for getting a particular page
	            int pageNum = Integer.parseInt(page);
	            headerList = (PagedListHolder<Header>)request.getSession().getAttribute("headerList");
	        	coresponseList = (PagedListHolder<Coresponse>)request.getSession().getAttribute("coresponseList");
	        	historyList = (PagedListHolder<History>)request.getSession().getAttribute("historyList");
	            
	        	if(pageNum == 1){
	        		if(historyList.getPageCount() > 0){
	                	if(headerList.getPageList().get(0).getPrss_code().equals(historyList.getPageList().get(0).getProcess_code())){
	                		
	                		request.getSession().setAttribute("dataTag", 1);
	                	}
	                }
	        	}
	            headerList.setPage(pageNum - 1);
	            coresponseList.setPage(pageNum - 1);
	            historyList.setPage(pageNum - 1);
	        }
			    mv.setViewName("display");
		        return mv;
		}*/
       
		
}
 }



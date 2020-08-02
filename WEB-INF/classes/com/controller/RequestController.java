package com.controller;

import com.dto.Coresponse;
import com.dto.Letter;
import com.dto.RequestDto;
import com.dto.UserDto;
import com.service.FilterData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.PageDto;
import com.service.RequestService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RequestController {//1

	
	@Autowired
	RequestService requestService;
	
	
	@RequestMapping(name = "/request")
	public String getRequestData(RequestDto requestDto, Model model ) {//2
		
		model.addAttribute("headers",requestService.getRequest(requestDto) );


		List<Coresponse> coresponse = requestService.getCorRequest(requestDto);
		model.addAttribute("Coresponses",requestService.getCorRequest(requestDto));

		model.addAttribute("history",requestService.getHisRequest(requestDto));
		
		FilterData filter = new FilterData();
		ArrayList<Letter> letters = filter.dataToFilter();
		UserDto userDto = new UserDto();
		// If User is IDND 
		if(userDto.getName() == "IDND")
		{//3
		for (Letter letter:letters) {//3a
			for(Coresponse cor:coresponse){//3b
		      if( letter.getLetter_name() == "LAST RECORD")
			   {//4
				    // no match to cor.getCoresponse_type()
					
				//set A HEF indicator = 0  Don't print < A HERF > tag
		    	  cor.setA_HREF_indicator("0");
				break;
			   }//4
			  else if (letter.getLetter_name() == cor.getCoresponse_type()){//5
				     if (letter.getProcess_year() == requestDto.getProcess_year()){//6
					    if (letter.getPrint_name_prg() == "NONE") {//7
						     
					    	//set A HEF indicator = 0  Don't print < A HERF > tag
					    	  cor.setA_HREF_indicator("0");
					    	  
							 break;
					}//7 else
					{//8
						//set A HEF indicator = 1  print < A HERF > tag  ;
						
				    	  cor.setA_HREF_indicator("1");
							 break;
					}//8
		  
		         } //6
			  }//5
		}//3b
		}//3a
		
		
	    }//3 if IDND
		
		
	return "display";
}//2
 } //1



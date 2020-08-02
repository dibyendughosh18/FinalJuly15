package com.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.UserDto;
import com.service.RequestService;

@Controller
public class LoginController {

	
	@Autowired
	RequestService requestService;
	
	private Logger logger = Logger.getLogger(LoginController.class.getName());
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String home(){
	    return "login"; 
	} 
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String helloView(@ModelAttribute("userDto") UserDto userDto, Model model,HttpServletRequest request) {
		
		
		
		String userName = userDto.getName();
		String password = userDto.getPassword();
		if(!userName.isEmpty() && !password.isEmpty()){
		List<UserDto> userList = requestService.validateUser(userName,password);
		
		if(userList.size() > 0){
			//UserDto user       = new UserDto();
			request.getSession().setAttribute("userDto", userDto);
			
			 return "requestInfo";
		}else{
			return "login";
		}
	
		}else{
			return "login";
		}

      }
		
		
		/*List<UserDto> user = requestService.getUserLogin(userDto);
    if(!user.isEmpty())
		return "requestInfo";
    else
    	return "login";
	} */
}

package com.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.UserDto;
import com.service.RequestService;

@Controller
public class LoginController {

	
	@Autowired
	RequestService requestService;
	
	private Logger logger = Logger.getLogger(LoginController.class.getName());
	@RequestMapping("/login")
	public String helloView(UserDto userDto, Model model) {
		logger.info("Username " +  userDto.getName());
		
		      UserDto user       = new UserDto();

            //get Name from the form

            user.setName(userDto.getName());

           

            // if User name is not empty get

           

          if(user.getName() != null && user.getName().length() != 0){

                  return "requestInfo";

          }

          else{

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

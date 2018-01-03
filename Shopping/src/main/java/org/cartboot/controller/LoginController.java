package org.cartboot.controller;

import org.cartboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
    LoginService service;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String displayLoginPage(ModelMap model){
		return "login";
	}
	
	@RequestMapping(value= "/login",method = RequestMethod.POST)
	public String displayHomePage(ModelMap model,@RequestParam String name,@RequestParam String password){
		boolean isValidUser = service.validateUserDetails(name, password); 
		if(isValidUser){
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}else{
			return "login";
		}
	}

}

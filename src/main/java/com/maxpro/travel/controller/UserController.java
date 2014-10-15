package com.maxpro.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maxpro.travel.domain.User;
import com.maxpro.travel.service.SearchService;
import com.maxpro.travel.service.UserService;

@Controller
@RequestMapping(value ="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String saveSearch(ModelMap model )
	{
		List results = userService.getAllSearch(); 
		model.addAttribute("users",results);
		return "users";
	}
	
	
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveSearch(@ModelAttribute("user") User user ,ModelMap model )
	{
		userService.saveSearch(user);
		List results = userService.getAllSearch(); 
		model.addAttribute("users",results);
		return "users";
	}
	
	
}

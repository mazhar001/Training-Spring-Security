package com.zensar.project.controller;

import java.security.PrivilegedExceptionAction;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView welcomePage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security ");
		model.addObject("message", "This is welcome Page");
		model.setViewName("hello");
		return model;
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView adminPage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security ");
		model.addObject("message", "Login User "+getPrincipal());
		model.setViewName("admin");
		return model;
	}	
	
	@RequestMapping(value="/superAdmin",method=RequestMethod.GET)
	public ModelAndView superPage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security ");
		model.addObject("message", "Login User Super"+getPrincipal());
		model.setViewName("admin");
		return model;
	}	
	
	@RequestMapping(value="/dba",method=RequestMethod.GET)
	public ModelAndView dbaPage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security ");
		model.addObject("message", "Login User dba "+getPrincipal());
		model.setViewName("admin");
		return model;
	}	
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView logout(){
		ModelAndView model = new ModelAndView();
		model.addObject("title","Logout ");
		model.addObject("message", "Login User dba "+getPrincipal());
		model.setViewName("admin");
		return model;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView model = new ModelAndView();
		
		model.setViewName("login");
		return model;
	}
	
	private String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails)
			userName = ((UserDetails)principal).getUsername();
		else
			userName = principal.toString();
		System.out.println(userName);
		return userName;
	}
}

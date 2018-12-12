package com.iss.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iss.Model.User;
import com.iss.Service.UserService;

@Controller
@RequestMapping(value = "/login")
public class UserController {

	@Autowired
	UserService uservice;
   
/*	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView listAll() {
		//ArrayList<User> ulist = uservice.findAllUsers();
    	ModelAndView mav = new ModelAndView("AdminHome");
    	return mav;
    }*/
	
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView admin() {
    	ModelAndView model = new ModelAndView("welcome");
    	return model;
    }
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
    public ModelAndView adminPage(@ModelAttribute User user) {
    	ModelAndView model = new ModelAndView("admin");	
	   	return model;
    }
	
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView user() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("error");
    	return model;
    }
    
}

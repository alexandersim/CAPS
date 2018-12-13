package com.iss.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class UserController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            Model model) {
        String errorMessage = null;
        if(error != null) {
            errorMessage = "Username or Password is incorrect !!";
        }
        if(logout != null) {
            errorMessage = "You have been successfully logged out !!";
        }
        model.addAttribute("errorMessage", errorMessage);
        return "welcome";
    }
  
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){   
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";
    }
    
    
    /* @RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("welcome");

		return model;

	}
	
	*/
	
	/*
	
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ModelAndView authenticate(@ModelAttribute User user, HttpSession session, BindingResult result) {
		ModelAndView mav = new ModelAndView("welcome");
		if (result.hasErrors())
			return mav;
		UserSession us = new UserSession();
		
		if (user.getName() != null && user.getPassword() != null) {
			User u = uService.authenticate(user.getName(), user.getPassword());
			us.setUser(u);
			
			
			// PUT CODE FOR SETTING SESSION ID
			us.setSessionId(session.getId());
			us.setEmployee(eService.findEmployeeById(us.getUser().getEmployeeId()));
			ArrayList<Employee> subordinates = eService.findSubordinates(us.getUser().getEmployeeId());
			if (subordinates != null) {
				us.setSubordinates(subordinates);

			}
			mav = new ModelAndView("redirect:/staff/history");
		} else {
			return mav;
		}
		session.setAttribute("USERSESSION", us);
		return mav;
	}
	*/
	
	
	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView admin() {
    	ModelAndView model = new ModelAndView("welcome");
    	return model;
    }
	
	@RequestMapping(value = "/admin/home", method = RequestMethod.POST)
    public ModelAndView adminPage(@ModelAttribute User user) {
    	return new ModelAndView ("admin");
    }
	
    @RequestMapping(value = "/login/error", method = RequestMethod.GET)
    public ModelAndView user() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("error");
    	return model;
    }*/
    
    
}

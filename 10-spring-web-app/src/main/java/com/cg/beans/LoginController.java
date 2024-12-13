package com.cg.beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login.htm")
	public ModelAndView login( @RequestParam("username")
	String uname) {
		ModelAndView mav= new ModelAndView();
		System.out.println("Hello");

		if(uname.equals("Banshita")) {
			//System.out.println("Login Success....Hello "+uname);
			mav.addObject("msg", "Hi "+uname+", Have a Wonderful Day !!");
			mav.setViewName("welcome.jsp");
		}
		else {
			System.out.println("Login failed ....");
			mav.setViewName("index.html");
		}
		return mav;
	}
	
	@RequestMapping("/logout.htm")
	public ModelAndView logout() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.html");
		System.out.println("Logout succesfully");
		return mav;
	}


}
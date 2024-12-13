package com.cg.beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/cal.htm")
public class CalcController {
	@RequestMapping("/cal.htm")
	public ModelAndView calculator( @RequestParam("num1")
	int num1, @RequestParam("num2") int num2, @RequestParam("calc") String calculate) {
		ModelAndView mav= new ModelAndView();
		if(calculate.equalsIgnoreCase("Add")) {
			mav.addObject("msg", "Result: "+(num1+num2));
			mav.setViewName("cal.jsp");
			return mav;
		}else if(calculate.equalsIgnoreCase("Subtract")) {
			mav.addObject("msg", "Result: "+(num1-num2));
			mav.setViewName("cal.jsp");
			return mav;
		}else if(calculate.equalsIgnoreCase("Multiply")) {
			mav.addObject("msg", "Result: "+(num1*num2));
			mav.setViewName("cal.jsp");
			return mav;
		}else{
			mav.addObject("msg", "Result: "+(num1/num2));
			mav.setViewName("cal.jsp");
			return mav;
			}
	}
}

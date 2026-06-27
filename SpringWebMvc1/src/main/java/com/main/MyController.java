package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

//	@RequestMapping(value = "/hellopage", method = RequestMethod.GET)
	@GetMapping("/hellopage")
	public ModelAndView openHelloPage()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello");
		
		
		return mav;
	}
	
	@GetMapping("/aboutus")
	public String OpenAboutusPage()
	{
		
		return "aboutus";
	}
	
	
}

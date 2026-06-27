package com.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;

import jakarta.servlet.http.HttpServlet;

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
	
	@GetMapping("/myForm")
	public String openMyFromPage()
	{
		
		return "my-form";
	}
	
	//we can use httpservlet req throught can request data but it not used in spring boot
	
//	@PostMapping("/submitForm")
//	public String myHandlerMethod(jakarta.servlet.http.HttpServletRequest req)
//	{
//		String myname= req.getParameter("name1");
//		String myemail= req.getParameter("email1");
//		String myphoneno= req.getParameter("phoneno1");
//		
//		System.out.println("Name:"+myname);
//		System.out.println("Email:"+myemail);
//		System.out.println("Phoneno:"+myphoneno);
//		
//		
//		return "profile";
//	}
	
 // we used @RequestParam annotaion to bind data from web request to method parameter in controller.
 // @requestParam annotation is used for getdata.
	
//	@PostMapping("/submitForm")
//	public String myHandlerMethod(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphoneno,
//			Model model
//			)
//	{
//		
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phoneno", myphoneno);
//
//		return "profile";
//	}
	
	//when we 30 no of data then you can pass data throught 30no of times with attribute name we store in user class
	
//	@PostMapping("/submitForm")
//	public String myHandlerMethod(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphoneno,
//			Model model
//			)
//	{
//		System.out.println("Name:"+myname);
//		System.out.println("Email:"+myemail);
//		System.out.println("Phoneno:"+myphoneno);
//		
//		
//		User user =new User();
//		user.setName(myname);
//		user.setEmail(myemail);
//		user.setPhoneno(myphoneno);
//		
//		model.addAttribute("model_user", user);
//		
//
//		return "profile";
//	}
	
	//when we have 50 no of data theen we used @ModelAttribute annotation is used to bind data from request parameter to java object
	
	
	
	@PostMapping("/submitForm")
	public String myHandlerMethod(@ModelAttribute User user)
	{
		
		System.out.println("Name:"+user.getName());
		System.out.println("Email"+user.getEmail());
		System.out.println("Phoneno"+user.getPhoneno());
		
		
		
		

		return "profile";
	}
	
	
	
	
	
}

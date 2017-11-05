package com.git.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

	@RequestMapping("irLogin")
	public ModelAndView redireccion() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("login");
		MV.addObject("usernamePh","SpringMVC");/// se agregan valores a variables jsp
		MV.addObject("passwordPh","SpringMVC");/// se agregan valores a variables jsp
		return MV;
	}
}

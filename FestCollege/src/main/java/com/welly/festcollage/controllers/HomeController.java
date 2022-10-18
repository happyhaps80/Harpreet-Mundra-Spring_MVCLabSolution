package com.welly.festcollage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/")
public class HomeController{

	@RequestMapping("/")
	public String showMainPage() {
		return "home";
	}
}

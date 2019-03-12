package com.schoolofnet.WebApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("/hello");
		
		mv.addObject("name", "Douglas");
		
		return mv;
	}
	
	@GetMapping("/new")
	public String newPath(Model model) {
		List<String> list = new ArrayList<String>();
		
		list.add("Douglas");
		list.add("Deborah");
		list.add("Dantas");
		list.add("Déborah");
		list.add("David");
		list.add("Jéssica");
		
		model.addAttribute("name", "Douglas");
		model.addAttribute("list", list);
		
		return "new";
	}
}

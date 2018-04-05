package com.training.springmvc.demospringmvc.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
//	@RequestMapping(path="/helloworld", method=RequestMethod.GET)
	@GetMapping("/helloworld/{id}/{name}")
	public String hello(@PathVariable(name="id", required=false) 
			Integer identifier,
			@PathVariable(name = "name", required = false) 
			String name, Model model, HttpServletRequest request) {
		model.addAttribute("helloMessage", "Hello world!!!"
			+ identifier + " " + name);
		return "persons/hello";
	}
	
	@RequestMapping(path="/helloworld", method=RequestMethod.POST)
	public String hello2(Model model) {
		model.addAttribute("helloMessage", "Hello world!!!");
		return "persons/hello";
	}
	
	@RequestMapping("/helloworld2")
	public String hello2() {
		return "persons/hello";
	}
	
	public static void main(String[] args) {
		System.out.println("sss" + null);
	}

}

package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody 
	public String ola() {
		 return "hello";
	}
	
	@RequestMapping("/teste")
	@ResponseBody
	public String mundo( ) {
		return "Ola mundo";
	}

}



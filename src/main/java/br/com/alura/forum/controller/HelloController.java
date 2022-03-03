package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	private String texto;
	
	@RequestMapping("/")
	@ResponseBody 
	public String ola() {
		 return "hello";
	}
	
	@RequestMapping("/teste")
	@ResponseBody
	public String mundo( ) {
		chamar("ola");
		chamar("ola", "glauber");		
		return this.texto;
	}

	
	public void chamar(String texto) {
		this.texto= texto;
	}
	
	public void chamar(String texto, String nome) {
		this.texto= texto + "" +  nome;
	}
}




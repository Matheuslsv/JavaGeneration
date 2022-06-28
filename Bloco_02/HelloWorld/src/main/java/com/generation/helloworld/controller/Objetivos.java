package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/objetivos")

public class Objetivos {
	
	@GetMapping
	public String objetivos() {
		return "1 - Estudar mais sobre banco de dados\n"
				+ "2 - Fazer os exercicios anteriores para fixar melhor\n"
				+ "3 - Estudar em grupo";
	}

}

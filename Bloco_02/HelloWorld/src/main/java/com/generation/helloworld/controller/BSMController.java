package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bsm")

public class BSMController {
	
	@GetMapping
	public String bsm() {
		return "BSM-0-Introdução às Habilidades Comportamentais e Mentalidades\n"
				+ "BSM-GM-Mentalidade de crescimento\n"
				+ "BSM-P-Persistência\n"
				+ "BSM-PR-Responsábilidade Pessoal\n"
				+ "BSM-FO-Orientação ao Futuro\n"
				+ "BSM-C-Comunicação\n"
				+ "BSM-OD-Orientação ao Detalhe\n"
				+ "BSM-PA-Proatividade\n"
				+ "BSM-T-Trabalho em Equipe";
	}

}

package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return"Hello Woorld!!!";
	}
	
	@GetMapping("/bsm")
	public String ListaDeBMS() {
		return ("Mentalidade de Crescimento"
				+ "\nPersistência"
				+ "\nResponsabilidade Pessoal"
				+ "\nOrientação ao Futuro"
				+ "\nOrientação ao Detalhe"
				+ "\nProatividade"
				+ "\nTrabalho em Equipe"
				+ "\nComunicação");
	
	}
	
	@GetMapping("/obj")
	public String obj() {
		return ("Aprender Spring"
				+ "\nTrabalhar bsm"
				+ "\nAvançar soft Skills");
	
		
	}
	

}

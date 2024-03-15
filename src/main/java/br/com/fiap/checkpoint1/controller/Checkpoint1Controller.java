package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Checkpoint1Controller {
	
	@Value("${spring.profiles.active:}")
	private String usuario;
	
	@GetMapping("/ping")
	public String ping() {
		
		if (usuario.equals("dev")) {
			return "Pong em dev";
		} else if (usuario.equals("stg")) {
			return "Pong em stg";
		} else if (usuario.equals("prd")) {
			return "Pong em prd";
		} else {
			return "Não foi encontrado profile";
		}
		
	}
	
}

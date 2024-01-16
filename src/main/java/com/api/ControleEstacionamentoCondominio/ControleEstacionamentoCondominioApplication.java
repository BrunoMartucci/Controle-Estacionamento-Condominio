package com.api.ControleEstacionamentoCondominio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControleEstacionamentoCondominioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleEstacionamentoCondominioApplication.class, args);
	}

	@GetMapping("/")
	public String inicio() {
		return "Olá Mundo!";
	}
}

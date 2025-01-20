package com.example.Challenge3_Literalura;

import com.example.Challenge3_Literalura.controller.LibroController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Challenge3LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private LibroController libroController;

	public static void main(String[] args) {
		SpringApplication.run(Challenge3LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		libroController.mostrarMenu();
	}
}

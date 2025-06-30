package com.alura.screenmatch;

import com.alura.screenmatch.principal.EjemploStreams;
import com.alura.screenmatch.principal.SeriePrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.security.Principal;


@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SeriePrincipal app = new SeriePrincipal();
		app.muestraElMenu();

//		EjemploStreams ejemploStreams = new EjemploStreams();
//		ejemploStreams.muestraEjemplo();
	}
}



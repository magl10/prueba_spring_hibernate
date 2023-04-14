package com.example.prueba;

import com.example.prueba.service.impl.TransaccionDaoImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}


	@Bean(name = "Transaccion")
	public TransaccionDaoImpl getSaludaService(){
		return new TransaccionDaoImpl();
	}

}

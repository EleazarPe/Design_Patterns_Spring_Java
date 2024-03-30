package com.example.facade;

import com.example.facade.Libreria.Carro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacadeApplication.class, args);

		// Si queremos crear un carro modelo XV, el cual es el unico que usamos;

		Simple simple = new Simple();

		Carro XVrojo = simple.crearCarroXV("Rojo");

		System.out.println(XVrojo.getModelo());
		System.out.println(XVrojo.getMotor().getHP());

	}

}

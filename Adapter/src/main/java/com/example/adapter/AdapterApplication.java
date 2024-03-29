package com.example.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {



	public static void main(String[] args) {
		SpringApplication.run(AdapterApplication.class, args);

		Carro carro = new Carro("Toyota");
		Submarine submarine = new Submarine("MX1020", "Submarino");

		CarroInterface submarineAdaptado = new SubmarineAdapter(submarine);

		System.out.println(carro.quienSoy());
		System.out.println(submarineAdaptado.quienSoy());



	}

}

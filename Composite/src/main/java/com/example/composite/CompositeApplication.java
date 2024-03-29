package com.example.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeApplication.class, args);


		CajaComposite solicitud = new CajaComposite(
				new CajaComposite(
						new Computer("Laptop", 125.50, "XM1001"),
						new Computer("PC", 850.99, "ZY150")
				),
				new Producto("Libro", 10.99)
		);

		System.out.println("El precio final es: " + solicitud.calcularPrecio());

	}

}

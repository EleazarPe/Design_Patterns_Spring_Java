package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.abstraccion.Cuadrado;
import com.example.demo.abstraccion.Circulo;
import com.example.demo.implementacion.Azul;
import com.example.demo.implementacion.Rojo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Cuadrado cuadrado = new Cuadrado(new Azul());
		cuadrado.crear();
		Circulo triangulo = new Circulo(new Rojo());
		triangulo.crear();
	}

}

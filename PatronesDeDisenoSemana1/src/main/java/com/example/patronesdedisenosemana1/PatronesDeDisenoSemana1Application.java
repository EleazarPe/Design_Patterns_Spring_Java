package com.example.patronesdedisenosemana1;

import com.example.patronesdedisenosemana1.encapsulaciones.EsferaFactory;
import com.example.patronesdedisenosemana1.encapsulaciones.PiramideFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PatronesDeDisenoSemana1Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(PatronesDeDisenoSemana1Application.class, args);
		EsferaFactory esferaFactory = context.getBean(EsferaFactory.class);
		PiramideFactory piramideFactory = context.getBean(PiramideFactory.class);
		esferaFactory.crearFigura().area();
		piramideFactory.crearFigura().area();

	}

}

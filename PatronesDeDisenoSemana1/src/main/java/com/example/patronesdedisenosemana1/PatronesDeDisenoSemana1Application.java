package com.example.patronesdedisenosemana1;

import com.example.patronesdedisenosemana1.encapsulaciones.AnimalFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.naming.Context;
import java.util.Objects;

@SpringBootApplication
public class PatronesDeDisenoSemana1Application {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(PatronesDeDisenoSemana1Application.class, args);
		ApplicationContext context =  SpringApplication.run(PatronesDeDisenoSemana1Application.class, args);
		AnimalFactory factory = context.getBean(AnimalFactory.class);
		factory.setTipo("perro");
		Objects.requireNonNull(factory.getObject()).hacerSonido();


	}

}

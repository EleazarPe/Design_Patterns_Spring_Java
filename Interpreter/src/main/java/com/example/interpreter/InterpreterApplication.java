package com.example.interpreter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterpreterApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterpreterApplication.class, args);

		Interpreter interpreter = new Interpreter(new Context());
		Float answer = interpreter.interpret("10 * 10 / 10 + 200");
		System.out.println(answer);

	}

}

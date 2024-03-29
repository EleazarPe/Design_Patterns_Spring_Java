package com.example.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.decorator.FacebookDecorator;
import com.example.decorator.SlackDecorator;

/*
 Con DecoratorClient, los componentes se pueden envolver en múltiples 
 capas de decoradores, siempre que se acceda a todos los objetos a través 
 de la interfaz del componente.
 */
@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorApplication.class, args);
		Notification notifyStack = new Notifier();
		notifyStack = new SMSDecorator(notifyStack);
		notifyStack = new FacebookDecorator(notifyStack);
		notifyStack = new SlackDecorator(notifyStack);
		notifyStack.sendMessage("Hello Medium");
	}

}

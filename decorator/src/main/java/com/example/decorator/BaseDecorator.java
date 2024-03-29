package com.example.decorator;

/*
BaseDecorator tiene un campo para hacer referencia a un
objeto envuelto. Para poder contener tanto componentes
concretos como decoradores, el tipo de campo debe
declararse como una interfaz de Notification. El
decorador base delega todas las operaciones al objeto envuelto.
*/
public abstract class BaseDecorator implements Notification {
	private Notification wrappee;

	public BaseDecorator(Notification wrappee) {
		this.wrappee = wrappee;
	}

	@Override
	public void sendMessage(String msg) {
		wrappee.sendMessage(msg);
	}
}

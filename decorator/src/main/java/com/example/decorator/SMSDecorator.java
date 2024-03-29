package com.example.decorator;

/*
 Un SMSDecorator define comportamientos adicionales 
 que se pueden agregar dinámicamente a los componentes. 
 SMSDecorator anula los métodos del decorador base y 
 ejecuta su comportamiento antes o después de llamar al 
 método principal. En este ejemplo, enviamos SMS después 
 de llamar al método principal.
 */
public class SMSDecorator extends BaseDecorator {

	public SMSDecorator(Notification wrappee) {
		super(wrappee);
	}

	@Override
	public void sendMessage(String msg) {
		super.sendMessage(msg);
		sendSMS(msg);
	}

	private void sendSMS(String msg) {
		System.out.println(msg + ", message sent in SMS");
	}
}
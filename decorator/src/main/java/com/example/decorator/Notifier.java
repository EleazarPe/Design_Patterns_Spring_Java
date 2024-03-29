package com.example.decorator;

//La clase Notifier implementa la interfaz de Notification. Esta clase define el comportamiento básico del envío de correo electrónico, que los decoradores pueden modificar.
public class Notifier implements Notification{

	@Override
	public void sendMessage(String msg) {
		System.out.println(msg + ", message sent in email");
	}
}

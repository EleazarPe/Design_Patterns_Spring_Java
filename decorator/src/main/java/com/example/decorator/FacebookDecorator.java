package com.example.decorator;

/*
 La clase FacebookDecorator define comportamientos 
 adicionales para enviar mensajes como notificaciones de 
 Facebook.
 */
public class FacebookDecorator extends BaseDecorator {

	public FacebookDecorator(Notification wrappee) {
		super(wrappee);
	}

	@Override
	public void sendMessage(String msg) {
		super.sendMessage(msg);
		sendFacebook(msg);
	}

	private void sendFacebook(String msg) {
		System.out.println(msg + ", message sent in Facebook");
	}
}
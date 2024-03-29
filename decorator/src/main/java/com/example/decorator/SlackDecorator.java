package com.example.decorator;

/*
 La clase SlackDecorator define comportamientos 
 adicionales para enviar mensajes como notificaciones de 
 Slack.
 */
public class SlackDecorator extends BaseDecorator {

	public SlackDecorator(Notification wrappee) {
		super(wrappee);
	}

	@Override
	public void sendMessage(String msg) {
		super.sendMessage(msg);
		sendSlack(msg);
	}

	private void sendSlack(String msg) {
		System.out.println(msg + ", message sent in Slack");
	}
}
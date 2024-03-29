package com.example.decorator;

//La interfaz de Notification (Componente) define la interfaz común para contenedores y objetos envueltos.
public interface Notification {
	public void sendMessage(String msg);
}
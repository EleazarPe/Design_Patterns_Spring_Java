package com.example.patronesdedisenosemana1;

public class SingletonClase {

    private String valor;
    private static SingletonClase instanciaUnica = null;

    // El constructor del Singleton debe ocultarse del código cliente. 
    // Ya que la llamada al método getInstancia debe ser la única manera de obtener el objeto de Singleton.
    private SingletonClase(String valor) {
        this.valor = valor;
    }

    // Este metodo estatico devuelve la misma instancia de su propia clase.
    // Este método almacena en caché el primer objeto creado y lo devuelve en todas las llamadas siguientes.
    public static SingletonClase getInstancia(String valor) {
        if (instanciaUnica == null){
            instanciaUnica = new SingletonClase(valor);
        }
        return instanciaUnica;
    }

    
    // Este método no toma ningún parámetro adicional y 
    // simplemente imprime el valor almacenado en el objeto 
    // Singleton al que pertenece.
    public String imprimirValor() {
        System.out.println(valor);
        return valor;
    }

    // Este método toma un parámetro adicional valor y cambia el valor 
    // almacenado en el objeto Singleton al que pertenece.
    public void cambiarValor(String valor) {
        this.valor = valor;
    }
}

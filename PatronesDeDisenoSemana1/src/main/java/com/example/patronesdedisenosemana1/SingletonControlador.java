package com.example.patronesdedisenosemana1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping()
public class SingletonControlador {


    // Aqui el Singleton se crea con el valor "singletonClase#1" en la primera llamada al método getInstancia, 
    // por lo que en la segunda llamada, el condicional if (instanciaUnica == null) en el método getInstancia evalúa como falso y no 
    // crea una nueva instancia. Por lo tanto, ambas variables singletonClase1 y singletonClase2 apuntan a la misma instancia del Singleton, 
    // y cuando se llama al método imprimirValor en ambas variables, se imprime el mismo valor dos veces.
    @GetMapping("/singletonClase1")
    public String getSingleton(HttpServletRequest request) {

        SingletonClase singletonClase1 = SingletonClase.getInstancia("singletonClase#1");
        SingletonClase singletonClase2 = SingletonClase.getInstancia("singletonClase#2");

        String cadena1 = singletonClase1.imprimirValor();
        String cadena2 = singletonClase2.imprimirValor();

        return cadena1 + "<br>" + cadena2;
    }


    // En este endpoint se cambia el valor para luego demostrar que ambas variables tanto 
    // singletonClase1 y singletonClase2 utilizan la misma instancia de la clase SingletonClase
    @GetMapping("/singletonClase2")
    public String getSingletonConCambioValor(HttpServletRequest request) {

        SingletonClase singletonClase1 = SingletonClase.getInstancia("singletonClase#1");
        SingletonClase singletonClase2 = SingletonClase.getInstancia("singletonClase#2");

        String cadena1 = singletonClase1.imprimirValor();
        String cadena2 = singletonClase2.imprimirValor();

        singletonClase2.cambiarValor("singletonClase#2");

        String cadena3 = singletonClase1.imprimirValor();
        String cadena4 = singletonClase2.imprimirValor();

        return String.format("singletonClase1 = %s <br> singletonClase2 = %s <br><br><br> singletonClase1 = %s <br> singletonClase2 = %s <br>", cadena1, cadena2, cadena3, cadena4);
    }
}

package com.example.patronesdedisenosemana1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping()
public class SingletonControlador {

    private final SingletonClase singletonClase1;
    private final SingletonClase singletonClase2;
    
    @Autowired
    public SingletonControlador(SingletonClase singletonClase) {
        this.singletonClase1 = singletonClase;
        this.singletonClase2 = singletonClase;
    }

    @GetMapping("/singletonClase1")
    public String getSingleton(HttpServletRequest request) {

        singletonClase1.setValor("singletonClase#1");
        singletonClase2.setValor("singletonClase#2");

        String cadena1 = singletonClase1.getValor();
        String cadena2 = singletonClase2.getValor();

        return cadena1 + "<br>" + cadena2;
    }


    @GetMapping("/singletonClase2")
    public String getSingletonConCambioValor(HttpServletRequest request) {

        String cadena1 = singletonClase1.getValor();
        String cadena2 = singletonClase2.getValor();

        singletonClase2.setValor("singletonClase#2");

        String cadena3 = singletonClase1.getValor();
        String cadena4 = singletonClase2.getValor();

        return String.format("singletonClase1 = %s <br> singletonClase2 = %s <br><br><br> singletonClase1 = %s <br> singletonClase2 = %s <br>", cadena1, cadena2, cadena3, cadena4);
    }
}

package com.example.proxy;

public class RealYoutube implements Youtube{
    @Override
    public void descargarVideo(String link) {
        System.out.println("Descargando video "+ link);
    }
}

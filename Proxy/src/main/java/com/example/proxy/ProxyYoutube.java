package com.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyYoutube implements Youtube{

    RealYoutube youtube = new RealYoutube();

    Map<String, String> cache = new HashMap<>();

    @Override
    public void descargarVideo(String link) {
        if (cache.get(link) == null){
            youtube.descargarVideo(link);
            cache.put(link,link);
        }else{
            System.out.println("Video " + link + " en cache, descargando desde proxy");
        }
    }
}

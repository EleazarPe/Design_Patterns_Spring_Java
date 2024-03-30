package com.example.facade.Libreria;

import java.util.Date;

public class Rueda {

    private String Tamano;
    private String Marca;
    private Date Fecha;

    public Rueda(String tamano, String marca, Date fecha) {
        Tamano = tamano;
        Marca = marca;
        Fecha = fecha;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        Tamano = tamano;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
}

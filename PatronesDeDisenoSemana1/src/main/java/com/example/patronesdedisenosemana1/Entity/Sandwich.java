package com.example.patronesdedisenosemana1.Entity;

public class Sandwich {

    int id;
    String tipoPan;
    String tipoQueso;
    String tipoCarne;
    String cantLechuga;
    String cantTomate;
    String cantCebolla;
    String cantKetchup;
    String cantMayonesa;

    public Sandwich(int id, String tipoPan, String tipoQueso, String tipoCarne, String cantLechuga,
             String cantTomate, String cantCebolla, String cantKetchup, String cantMayonesa) {
        this.id = id;
        this.tipoPan = tipoPan;
        this.tipoQueso = tipoQueso;
        this.tipoCarne = tipoCarne;
        this.cantLechuga = cantLechuga;
        this.cantTomate = cantTomate;
        this.cantCebolla = cantCebolla;
        this.cantKetchup = cantKetchup;
        this.cantMayonesa = cantMayonesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getCantLechuga() {
        return cantLechuga;
    }

    public void setCantLechuga(String cantLechuga) {
        this.cantLechuga = cantLechuga;
    }

    public String getCantTomate() {
        return cantTomate;
    }

    public void setCantTomate(String cantTomate) {
        this.cantTomate = cantTomate;
    }

    public String getCantCebolla() {
        return cantCebolla;
    }

    public void setCantCebolla(String cantCebolla) {
        this.cantCebolla = cantCebolla;
    }

    public String getCantKetchup() {
        return cantKetchup;
    }

    public void setCantKetchup(String cantKetchup) {
        this.cantKetchup = cantKetchup;
    }

    public String getCantMayonesa() {
        return cantMayonesa;
    }

    public void setCantMayonesa(String cantMayonesa) {
        this.cantMayonesa = cantMayonesa;
    }
}

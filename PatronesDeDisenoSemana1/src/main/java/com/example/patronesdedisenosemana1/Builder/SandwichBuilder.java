package com.example.patronesdedisenosemana1.Builder;

import com.example.patronesdedisenosemana1.Entity.Sandwich;

public class SandwichBuilder {

    int id;
    String tipoPan;
    String tipoQueso;
    String tipoCarne;
    String cantLechuga;
    String cantTomate;
    String cantCebolla;
    String cantKetchup;
    String cantMayonesa;

    public SandwichBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public SandwichBuilder setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
        return this;
    }
    public SandwichBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    public SandwichBuilder setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }
    public SandwichBuilder setCantLechuga(String cantLechuga) {
        this.cantLechuga = cantLechuga;
        return this;
    }
    public SandwichBuilder setCantTomate(String cantTomate) {
        this.cantTomate = cantTomate;
        return this;
    }
    public SandwichBuilder setCantCebolla(String cantCebolla) {
        this.cantCebolla = cantCebolla;
        return this;
    }
    public SandwichBuilder setCantKetchup(String cantKetchup) {
        this.cantKetchup = cantKetchup;
        return this;
    }
    public SandwichBuilder setCantMayonesa(String cantMayonesa) {
        this.cantMayonesa = cantMayonesa;
        return this;
    }

    public Sandwich build(){
        return new Sandwich(id, tipoPan, tipoQueso, tipoCarne, cantLechuga, cantTomate, cantCebolla, cantKetchup, cantMayonesa);
    }

    public SandwichBuilder buildSandwich1(){
        SandwichBuilder builder = new SandwichBuilder();
        builder.setId(1)
                .setTipoPan("integral")
                .setTipoQueso("danes")
                .setTipoCarne("pavo")
                .setCantLechuga("poco")
                .setCantTomate("mucho");
        return builder;
    }
}

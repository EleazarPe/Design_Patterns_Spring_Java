package com.example.patronesdedisenosemana1.Director;

import com.example.patronesdedisenosemana1.Builder.SandwichBuilder;

public class SandwichDirector {

    public SandwichDirector() {
    }

    public void buildSandwich1(SandwichBuilder sandwichBuilder){
        sandwichBuilder.setId(1)
                .setTipoPan("integral")
                .setTipoQueso("danes")
                .setTipoCarne("pavo")
                .setCantLechuga("poco")
                .setCantTomate("mucho");
    }


}

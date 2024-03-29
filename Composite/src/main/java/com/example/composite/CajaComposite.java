package com.example.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CajaComposite implements Caja{

    private List<Caja> children;

    public CajaComposite(Caja... children) {
        this.children = new ArrayList<>();
        this.children.addAll(Arrays.stream(children).toList());
    }

    @Override
    public double calcularPrecio() {
        return children.stream().mapToDouble(Caja::calcularPrecio).sum();
    }

    public List<Caja> getChildren() {
        return children;
    }

    public void setChildren(List<Caja> children) {
        this.children = children;
    }
}

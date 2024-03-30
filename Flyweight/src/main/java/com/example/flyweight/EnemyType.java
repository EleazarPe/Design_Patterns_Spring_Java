package com.example.flyweight;

public class EnemyType {

    private String name;
    private String size;
    private String color;
    private double damage;

    public EnemyType(String name, String size, String color, double damage) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getDamage() {
        return damage;
    }
}

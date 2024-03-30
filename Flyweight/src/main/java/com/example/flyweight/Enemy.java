package com.example.flyweight;

public class Enemy {

    private int x;
    private int y;
    private double Health;
    private EnemyType enemyType;

    public Enemy(int x, int y, double health, EnemyType enemyType) {
        this.x = x;
        this.y = y;
        Health = health;
        this.enemyType = enemyType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getHealth() {
        return Health;
    }

    public void setHealth(double health) {
        Health = health;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }
}

package org.example.rpg;

public abstract class Monster implements Bleedable {
    private String name;
    private int hitPoint;
    private double damage;

    public Monster(String name, int hitPoint, double damage) {
        this.damage = damage;
        this.hitPoint = hitPoint;
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public String getName() {
        return name;
    }
    public abstract double attack();
}

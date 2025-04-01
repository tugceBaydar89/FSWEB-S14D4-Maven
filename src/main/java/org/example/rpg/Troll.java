package org.example.rpg;

import org.example.rpg.Utils.Constant;

public class Troll extends Monster implements Poisonable, Bleedable {


    public Troll(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double attack() {
        return getDamage()+bleed()+poison();
    }

    @Override
    public double bleed() {
        return getDamage() * Constant.BLEED_PERC;
    }

    @Override
    public double bleed(int level) {
        return level*getDamage() * Constant.BLEED_PERC;
    }

    @Override
    public int getHitPoints() {
        return 0;
    }

    @Override
    public double poison() {
        return getDamage() * Constant.POISON_PERC;
    }
}

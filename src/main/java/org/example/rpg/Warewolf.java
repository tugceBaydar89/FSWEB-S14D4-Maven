package org.example.rpg;

import org.example.rpg.Utils.Constant;

public class Warewolf extends Monster implements Bleedable{
    public Warewolf(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return getDamage() * Constant.BLEED_PERC;
    }

    @Override
    public double bleed(int level) {
        return level * getDamage() * Constant.BLEED_PERC;
    }

    @Override
    public int getHitPoints() {
        return 0;
    }
}

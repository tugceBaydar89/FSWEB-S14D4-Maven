package org.example.rpg;

import org.example.rpg.Utils.Constant;

public interface Poisonable {

    default double poison() {
        return Constant.POISON_PERC;
    }


}

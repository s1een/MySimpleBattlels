package com.game;

public class Defender extends Warrior {
    private int defense = 2;

    public Defender() {
        super(60, 3);
    }

    public int getDefense() {
        int defenceCalc = defense + weaponList.stream().mapToInt(i -> i.getDefense()).sum();
        if(defenceCalc <= 0) return 0;
        if(defenceCalc >= 100) return 100;
        return defenceCalc;
    }

    @Override
    public void getDamage(hasAttack warrior) {
        if (defense > warrior.getAttack()) {
            setHealth(getInitHealth());
        } else {
            setHealth(getHealth() + getDefense() - warrior.getAttack());
        }
    }
}

package com.game;

public class Vampire extends Warrior{
    private int vampirism = 50;

    public Vampire() {
        super(40,4);
    }

    public int getVampirism() {
        int vampCalc = vampirism + weaponList.stream().mapToInt(i -> i.getVampirism()).sum();
        if(vampCalc <= 0) return 0;
        if(vampCalc > 100) return 100;
        return vampCalc;
    }

    @Override
    public void attack(Warrior warrior) {
        int currentDmg = warrior.getHealth();
        int tmp;
        warrior.getDamage(this);
        currentDmg -= warrior.getHealth();
        if(currentDmg >= warrior.getHealth()){
            tmp = currentDmg - warrior.getHealth();
            setHealth(getHealth() + tmp);
        }else{
            healCalc(currentDmg);
        }
    }
    private void healCalc(int currentDmg){
        int r = getHealth() + (currentDmg * getVampirism() / 100);
        if(r >= getInitHealth()) setHealth(getInitHealth());
        else setHealth(r);
    }
}

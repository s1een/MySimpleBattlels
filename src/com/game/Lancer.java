package com.game;

public class Lancer extends Warrior{
    private static int decay = 50;
    public Lancer(){
        super(50,6);
    }

    @Override
    public void attack(Warrior warrior) {
        int healthDecrease = warrior.getHealth();
        warrior.getDamage(this);
        healthDecrease -= Math.max(0,warrior.getHealth());
        int attackForSecond = healthDecrease * decay / 100;
        if(warrior.getBehind() != null && warrior.getBehind().isAlive()){
        warrior.getBehind().getDamage(() -> attackForSecond);}
    }

}

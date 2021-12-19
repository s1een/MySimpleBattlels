package com.game;

public class Healer extends Warrior{
    private int heal = 2;
    public Healer(){
       super(60,0);
   }

    public int getHeal() {
        int healCalc = heal + weaponList.stream().mapToInt(i -> i.getHealPower()).sum();
        if(healCalc <= 0) return 0;
        return healCalc;
    }

    public void healPerson(Warrior warrior){
       if(warrior.getInitHealth() < warrior.getHealth() + getHeal()){
           warrior.setHealth(warrior.getInitHealth());
       }else{
           warrior.setHealth(warrior.getHealth() + getHeal());
       }
    }
        @Override
    public void handleSignalFrom(Warrior warrior) {
       healPerson(warrior);
       super.transmitSignal();
    }
}

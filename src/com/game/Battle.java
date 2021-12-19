package com.game;

public class Battle {
    public static boolean fight(Warrior w1, Warrior w2) {
        Warrior attacker = w1;
        Warrior defender = w2;
        while (attacker.isAlive()){
            attacker.attack(defender);
            var temp = defender;
            defender = attacker;
            attacker = temp;
        }
        var res = w1.isAlive();
        System.out.println(res ? "Winner -> Warrior 1": "Winner -> Warrior 2");
        return w1.isAlive();
    }
    public static boolean armyFight(Army army1, Army army2){
        while (true){
            var attacker = army1.getFirst();
            if(attacker.isEmpty()){
                return false;
            }
            var defender = army2.getFirst();
            if(defender.isEmpty()){
                return true;
            }
            fight(attacker.get(),defender.get());
        }
    }
}

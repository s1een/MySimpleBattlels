package com.game;
import com.game.weapons.*;
public class Main {
    public static void main(String[] args) {
//        Warrior w = new Warrior();
//        Knight k = new Knight();
//        Defender d = new Defender();
//        Vampire v = new Vampire();
//        Healer h = new Healer();
//        Weapon katana = new Weapon(-100,7,-3,0,0);
//        d.equipWeapon(katana);
//        Battle.fight(v,d);
        Sword sword = new Sword();
        GreatAxe greatAxe = new GreatAxe();
        Army army1 = new Army();
        Army army2 = new Army();
        army1.addUnits("Lancer",1);
        army1.addUnits("Healer",1);
        army1.units.get(0).equipWeapon(sword);
        army1.addUnits("Warrior",1);
        army2.addUnits("Warrior",1);
        army2.addUnits("Healer",1);
        Battle.armyFight(army1,army2);


    }
}

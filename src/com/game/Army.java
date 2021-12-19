package com.game;

import java.util.ArrayList;
import java.util.Optional;

public class Army {
    ArrayList<Warrior> units = new ArrayList<>();
    Army addUnits(String classWarrior,int count){
        for (int i = 0; i < count; i++) {
            Warrior warrior = Warrior.of(classWarrior);
            units.add(warrior);
            changePosition(units.size());
        }
        return this;}
    private void changePosition(int size){
        for (int i = 0; i < size; i++) {
            if(i != size - 1 && units.get(i+1).isAlive()){
                units.get(i).setBehindWarrior(units.get(i+1));
            }
        }
    }
    public Optional<Warrior> getFirst() {
        return units.stream().filter(Warrior::isAlive).findFirst();
    }
    private void removeUnit(Warrior warrior){
        units.remove(warrior);
        warrior.setBehindWarrior(null);
        units.add(warrior);
        changePosition(units.size());
    }
}

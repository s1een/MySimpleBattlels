package com.game;

import com.game.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warrior implements hasAttack{
    protected int health;
    protected int attack;
    private Warrior behind;
    private int initialHealth;
    List<Weapon> weaponList = new ArrayList<Weapon>();
   public static Warrior of(String clazz){
        switch (clazz){
            case "Warrior":
                return new Warrior();
            case "Knight":
                return new Knight();
            case "Defender":
                return new Defender();
            case "Rookie":
                return new Rookie();
            case "Vampire":
                return new Vampire();
            case "Lancer":
                return new Lancer();
            case "Healer":
                return new Healer();
            default:
                throw new IllegalArgumentException("Unknown Warrior type: " + clazz);
        }
    }
    public Warrior(int hp,int dmg) {
        health = hp;
        attack = dmg;
        setInitHealth(hp);
    }
    public Warrior(){
       health = 50;
       attack = 5;
       setInitHealth(health);
    }
    public void transmitSignal(){
       if(!Objects.isNull(this.getBehind())){
           this.getBehind().handleSignalFrom(this);
       }
    }
    public void handleSignalFrom(Warrior warrior){
       if(!Objects.isNull(warrior.getBehind())){
           warrior.getBehind().transmitSignal();
       }
    }

    private void setInitHealth(int hp){
       initialHealth = hp;
    }
    public int getInitHealth(){
       return initialHealth;
    }
    protected Warrior getBehind() {
        return behind;
    }

    public void setBehind(Warrior behind) {
        this.behind = behind;
    }
    protected void setBehindWarrior(Warrior warrior){
       setBehind(warrior);
    }

    public boolean isAlive(){
        return getHealth() > 0;
    }

    public int getHealth() {
       return health;
    }
    public int getMaxHealth(){
       int healthCalc = getInitHealth() + weaponList.stream().mapToInt(i -> i.getHealth()).sum();
       if(healthCalc <= 0) return 0;
       return healthCalc;
    }

    public int getAttack() {
       int attackCalc = attack + weaponList.stream().mapToInt(i -> i.getAttack()).sum();
       if(attackCalc <= 0) return 0;
       return attackCalc;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack (Warrior warrior){
        warrior.getDamage(this);
        transmitSignal();
    }
    public void getDamage(hasAttack warrior){
        setHealth(getHealth() - warrior.getAttack());
    }

    Warrior equipWeapon(Weapon weapon){
       this.weaponList.add(weapon);
       setHealth(getMaxHealth());
       setInitHealth(getMaxHealth());
       return this;
    }
}

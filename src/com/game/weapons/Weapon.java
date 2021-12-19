package com.game.weapons;

public class Weapon {
    private int health;
    private int attack;
    private int defense;
    private int vampirism;
    private int healPower;

    public Weapon(int health, int attack, int defense, int vampirism, int healPower) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.vampirism = vampirism;
        this.healPower = healPower;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getVampirism() {
        return vampirism;
    }

    public int getHealPower() {
        return healPower;
    }

}

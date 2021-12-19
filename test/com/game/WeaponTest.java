package com.game;

import com.game.weapons.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class WeaponTest {
    @Test
    @DisplayName("Test 1: Warrior vs Vampire")
    void Test1() {
        var unit_1 = new Warrior();
        var unit_2 = new Vampire();
        unit_1.equipWeapon(new Weapon(-10,5,0,40,0));
        unit_2.equipWeapon(new Sword());
        Battle.fight(unit_1, unit_2);
        var result = Battle.fight(unit_1, unit_2);

        assertTrue(result, "unit_1 should have won");
    }

    @Test
    @DisplayName("Test 2: Defender vs Lancer")
    void Test2() {
        var unit_1 = new Defender();
        var unit_2 = new Lancer();
        unit_1.equipWeapon(new Shield());
        unit_2.equipWeapon(new GreatAxe());
        Battle.fight(unit_1, unit_2);
        var result = Battle.fight(unit_1, unit_2);

        assertFalse(result, "unit_2 should have won");
    }

    @Test
    @DisplayName("Test 3: Healer vs Knight")
    void Test3() {
        var unit_1 = new Healer();
        var unit_2 = new Knight();

        unit_1.equipWeapon(new MagicWand());
        unit_2.equipWeapon(new Katana());

        Battle.fight(unit_1, unit_2);
        var result = Battle.fight(unit_1, unit_2);

        assertFalse(result, "unit_2 should have won");
    }

    @Test
    @DisplayName("Test 4: Defender vs Vampire")
    void Test4() {
        var unit_1 = new Defender();
        var unit_2 = new Vampire();

        unit_1.equipWeapon(new Shield());
        unit_1.equipWeapon(new MagicWand());
        unit_2.equipWeapon(new Shield());
        unit_2.equipWeapon(new Katana());

        Battle.fight(unit_1, unit_2);
        var result = Battle.fight(unit_1, unit_2);

        assertFalse(result, "unit_2 should have won");
    }

    @Test
    @DisplayName("Battle 1")
    void Test5() {
        var army_1 = new Army();
        var army_2 = new Army();
        var magicWind = new MagicWand();
        var greatAxe = new GreatAxe();
        army_1.addUnits("Knight",1);
        army_1.addUnits("Lancer",1);

        army_2.addUnits("Vampire",1);
        army_2.addUnits("Healer",1);

        army_1.units.get(0).equipWeapon(magicWind);
        army_1.units.get(1).equipWeapon(greatAxe);

        army_2.units.get(0).equipWeapon(magicWind);
        army_2.units.get(1).equipWeapon(greatAxe);

        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }

    @Test
    @DisplayName("Battle 2")
    void Test6() {
        var army_1 = new Army();
        var army_2 = new Army();
        var sword = new Sword();
        var greatAxe = new GreatAxe();
        army_1.addUnits("Defender",1);
        army_1.addUnits("Warrior",1);

        army_2.addUnits("Knight",1);
        army_2.addUnits("Healer",1);

        army_1.units.get(0).equipWeapon(greatAxe);
        army_1.units.get(1).equipWeapon(greatAxe);

        army_2.units.get(0).equipWeapon(sword);
        army_2.units.get(1).equipWeapon(sword);

        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }

    @Test
    @DisplayName("Battle 3")
    void Test7() {
        var army_1 = new Army();
        var army_2 = new Army();
        var katana = new Katana();
        var shield = new Shield();
        army_1.addUnits("Defender",2);

        army_2.addUnits("Knight",1);
        army_2.addUnits("Vampire",1);

        army_1.units.get(0).equipWeapon(katana);
        army_1.units.get(1).equipWeapon(katana);

        army_2.units.get(0).equipWeapon(katana);
        army_2.units.get(1).equipWeapon(katana);

        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }

    @Test
    @DisplayName("Battle 4")
    void Test8() {
        var army_1 = new Army();
        var army_2 = new Army();
        var firstWeapon = new Weapon(-20,6,1,40,-2);
        var secondWeapon = new Weapon(20,-2,2,-55,3);
        army_1.addUnits("Knight",3);

        army_2.addUnits("Warrior",1);
        army_2.addUnits("Defender",2);

        army_1.units.get(0).equipWeapon(firstWeapon);
        army_1.units.get(1).equipWeapon(firstWeapon);
        army_1.units.get(2).equipWeapon(secondWeapon);

        army_2.units.get(0).equipWeapon(firstWeapon);
        army_2.units.get(1).equipWeapon(secondWeapon);
        army_2.units.get(2).equipWeapon(secondWeapon);

        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }

    @Test
    @DisplayName("Battle 5")
    void Test9() {
        var army_1 = new Army();
        var army_2 = new Army();
        var firstWeapon = new Weapon(-20,1,1,40,-2);
        var secondWeapon = new Weapon(20,2,2,-55,3);
        army_1.addUnits("Vampire",3);

        army_2.addUnits("Warrior",1);
        army_2.addUnits("Defender",2);

        army_1.units.get(0).equipWeapon(firstWeapon);
        army_1.units.get(1).equipWeapon(firstWeapon);
        army_1.units.get(2).equipWeapon(secondWeapon);

        army_2.units.get(0).equipWeapon(firstWeapon);
        army_2.units.get(1).equipWeapon(secondWeapon);
        army_2.units.get(2).equipWeapon(secondWeapon);

        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
}

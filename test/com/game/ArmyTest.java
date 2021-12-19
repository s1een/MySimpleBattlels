package com.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class ArmyTest {
    @Test
    @DisplayName("Battle 1")
    void Test1(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",1);
        army_2.addUnits("Warrior",2);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 2")
    void Test2(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",2);
        army_2.addUnits("Warrior",3);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 3")
    void Test3(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",5);
        army_2.addUnits("Warrior",7);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 4")
    void Test4(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",20);
        army_2.addUnits("Warrior",21);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 5")
    void Test5(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",10);
        army_2.addUnits("Warrior",11);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 6")
    void Test6(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",11);
        army_2.addUnits("Warrior",7);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 7")
    void Test7(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",5);
        army_1.addUnits("Defender",4);
        army_1.addUnits("Defender",5);
        army_2.addUnits("Warrior",4);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 8")
    void Test8(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",20);
        army_1.addUnits("Defender",5);
        army_1.addUnits("Defender",4);
        army_2.addUnits("Warrior",21);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 9")
    void Test9(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",15);
        army_1.addUnits("Defender",5);
        army_2.addUnits("Warrior",5);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 10")
    void Test10(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",1);
        army_1.addUnits("Defender",3);
        army_2.addUnits("Warrior",5);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 11")
    void Test11(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",2);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",3);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 12")
    void Test12(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",5);
        army_1.addUnits("Vampire",6);
        army_1.addUnits("Warrior",7);
        army_2.addUnits("Warrior",6);
        army_2.addUnits("Defender",6);
        army_2.addUnits("Vampire",6);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 13")
    void Test13(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",11);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",13);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 14")
    void Test14(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Defender",9);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",8);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",13);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 15")
    void Test15(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Lancer",5);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_1.addUnits("Defender",2);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",6);
        army_2.addUnits("Lancer",5);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 16")
    void Test16(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Lancer",7);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Warrior",4);
        army_1.addUnits("Defender",2);
        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Vampire",6);
        army_2.addUnits("Lancer",4);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 17")
    void Test17(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Lancer",7);
        army_1.addUnits("Vampire",3);
        army_1.addUnits("Healer",1);
        army_1.addUnits("Warrior",4);
        army_1.addUnits("Healer",1);
        army_1.addUnits("Defender",2);

        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Healer",1);
        army_2.addUnits("Vampire",6);
        army_2.addUnits("Lancer",4);
        var result =  Battle.armyFight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 18")
    void Test18(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Lancer",1);
        army_1.addUnits("Warrior",3);
        army_1.addUnits("Healer",1);
        army_1.addUnits("Warrior",4);
        army_1.addUnits("Healer",1);
        army_1.addUnits("Knight",2);

        army_2.addUnits("Warrior",4);
        army_2.addUnits("Defender",4);
        army_2.addUnits("Healer",1);
        army_2.addUnits("Vampire",6);
        army_2.addUnits("Lancer",4);
        var result =  Battle.armyFight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
}

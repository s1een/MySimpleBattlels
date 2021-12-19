package com.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    @DisplayName("Test 1: Warrior vs Knight")
    void Test1() {
        var carl = new Warrior();
        var jim = new Knight();


        var result = Battle.fight(carl, jim);

        assertFalse(result, "Carl should have lose");
    }

    @Test
    @DisplayName("Test 2: Knight vs Warrior")
    void Test2() {
        var ramon = new Knight();
        var slevin = new Warrior();


        var result = Battle.fight(ramon, slevin);

        assertTrue(result, "Ramon should have won");
    }

    @Test
    @DisplayName("Test 3: Warrior vs Warrior")
    void Test3() {
        var bob = new Warrior();
        var mars = new Warrior();

        Battle.fight(bob, mars);
        var result = bob.isAlive();

        assertTrue(result, "Bob is Alive");
    }

    @Test
    @DisplayName("Test 4: Knight vs Warrior")
    void Test4() {
        var zeus = new Knight();
        var godkiller = new Warrior();

        Battle.fight(zeus, godkiller);
        var result = zeus.isAlive();

        assertTrue(result, "Zeus is Alive");
    }

    @Test
    @DisplayName("Test 5: Warrior vs Warrior")
    void Test5() {
        var husband = new Warrior();
        var wife = new Warrior();

        Battle.fight(husband, wife);
        var result = wife.isAlive();

        assertFalse(result, "Wife is Alive");
    }

    @Test
    @DisplayName("Test 6: Warrior vs Knight")
    void Test6() {
        var dragon = new Warrior();
        var knight = new Knight();

        Battle.fight(dragon, knight);
        var result = knight.isAlive();

        assertTrue(result, "Knight is Alive");
    }

    @Test
    @DisplayName("Test 7: Warrior vs Knight")
    void Test7() {
        var unit_1 = new Warrior();
        var unit_2 = new Knight();
        var unit_3 = new Warrior();
        Battle.fight(unit_1, unit_2);
        var result = Battle.fight(unit_2, unit_3);

        assertFalse(result, "unit_2 should have won");
    }
    @ParameterizedTest(name = "[{index}] {0} vs {1} Result => {2}")
    @CsvSource({"Defender,Warrior,true",
            "Defender,Rookie,true",})
    void fightWarriors(String firstWarriorType,
                       String SecondWarriorType,
                       boolean expected){
        var first = Defender.of(firstWarriorType);
        var second = Warrior.of(SecondWarriorType);
        var result = Battle.fight(first,second);
        assertEquals(expected,result);
    }
}
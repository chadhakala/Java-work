package com.example.boragontrail;


import java.util.Random;

public class Player {

private int hitPoints, strength, dexterity, intelligence, gold;

    public Player() {
      this.hitPoints = 20;
      this.strength = rollDice(6) + rollDice(6) + rollDice(6);
      this.dexterity = rollDice(6) + rollDice(6) + rollDice(6);
      this.intelligence = rollDice(6) + rollDice(6) + rollDice(6);
      this.gold = 0;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength += strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence += intelligence;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold += gold;
    }


    public int rollDice(int side){
        Random random = new Random();
        return random.nextInt(side)+ 1;
    }
}

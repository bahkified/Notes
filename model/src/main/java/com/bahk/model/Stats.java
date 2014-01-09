package com.bahk.model;

public class Stats {

    private int power;
    private int precision;
    private int condition_damage;
    private int toughness;
    private int vitality;
    private int healing_power;
    private int critical_damage;

    public int getCritical_damage() {
        return critical_damage;
    }

    public void setCritical_damage(int critical_damage) {
        this.critical_damage = critical_damage;
    }

    public int getPower() { return power; }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getCondition_damage() {
        return condition_damage;
    }

    public void setCondition_damage(int condition_damage) {
        this.condition_damage = condition_damage;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) { this.toughness = toughness; }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getHealing_power() {
        return healing_power;
    }

    public void setHealing_power(int healing_power) {
        this.healing_power = healing_power;
    }
}

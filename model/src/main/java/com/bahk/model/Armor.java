package com.bahk.model;

public class Armor {

    private int armor_value;
    private Prefix prefix;
    private Rune rune;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }

    public int getArmorValue() {
        return armor_value;
    }

    public void setArmorValue(int armor_value) {
        this.armor_value = armor_value;
    }
}

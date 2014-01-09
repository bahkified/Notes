package com.bahk.model;

public enum Prefix {

    BESERKER("beserker"),
    SOLDIER("soldier"),
    VALKYRIE("valkyrie"),
    ASSASSIN("assassin"),
    RAMPAGER("rampager"),
    KNIGHT("knight"),
    CAVALIER("cavalier"),
    SETTLER("settler"),
    GIVER("giver"),
    SENTINEL("sentinel"),
    SHAMAN("shaman"),
    CARRION("carrion"),
    RABID("rabid"),
    DIRE("dire"),
    CLERIC("cleric"),
    MAGI("magi"),
    APOTHECARY("apothecary"),
    CELESTIAL("celestial");

    private String name;

    Prefix(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

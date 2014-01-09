package com.bahk.model;

public class UpgradeComponent {

    private String name;
    private Stats statsBonus;
    private String otherEffect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getStatsBonus() {
        return statsBonus;
    }

    public void setStatsBonus(Stats statsBonus) {
        this.statsBonus = statsBonus;
    }

    public String getOtherEffect() {
        return otherEffect;
    }

    public void setOtherEffect(String otherEffect) {
        this.otherEffect = otherEffect;
    }
}

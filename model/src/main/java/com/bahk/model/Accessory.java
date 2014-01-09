package com.bahk.model;

public class Accessory {

    private String name;
    private Rarity rarity;
    private Stats stats;
    private UpgradeComponent upgrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public UpgradeComponent getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(UpgradeComponent upgrade) {
        this.upgrade = upgrade;
    }
}

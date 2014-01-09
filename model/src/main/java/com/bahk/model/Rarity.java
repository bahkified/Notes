package com.bahk.model;

public enum Rarity {

    FINE("fine"),
    MASTERWORK("masterwork"),
    RARE("rare"),
    EXOTIC("exotic"),
    ASCENDED("ascended");

    private String tier;

    private Rarity(String tier) {
        this.tier = tier;
    }

    public String getTier() {
        return tier;
    }

    public static Rarity getRarityByTier(String tier) {
        for (Rarity r : Rarity.values()) {
            if (r.getTier().equals(tier)) {
                return r;
            }
        }
        return null;
    }

}

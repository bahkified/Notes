package com.bahk.model;

public class WeaponSet {

    private Weapon mainhand;
    private Weapon offhand;

    public Weapon getMainhand() { return mainhand; }

    public void setMainhand(Weapon mainhand) {

        if (!mainhand.canBeMainhand()) {
            throw new UnsupportedOperationException("Weapon "
                    + mainhand + " cannot be used in the mainhand slot!");
        }

        this.mainhand = mainhand;
        if (mainhand.isTwoHanded()) {
            setOffhand(null);
        }
    }

    public Weapon getOffhand() {
        return offhand;
    }

    public void setOffhand(Weapon offhand) {

        if (!offhand.canBeOffhand()) {
            throw new UnsupportedOperationException("Weapon "
                    + offhand + " cannot be used in the offhand slot!");
        }

        this.offhand = offhand;
        if (mainhand.isTwoHanded()) {
            setMainhand(null);
        }

    }
}

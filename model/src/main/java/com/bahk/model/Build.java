package com.bahk.model;

import java.util.List;

public class Build {

    private long id;

    private CharacterClass characterClass;

    private WeaponSet set1;
    private WeaponSet set2;
    private WeaponSet underwater1;
    private WeaponSet underwater2;

    private ArmorSet armorSet;
    private AccessorySet accessories;

    private TraitSet traits;
    private List<Skill> skills;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public WeaponSet getSet1() {
        return set1;
    }

    public void setSet1(WeaponSet set1) {
        this.set1 = set1;
    }

    public WeaponSet getSet2() {
        return set2;
    }

    public void setSet2(WeaponSet set2) {
        this.set2 = set2;
    }

    public WeaponSet getUnderwater1() {
        return underwater1;
    }

    public void setUnderwater1(WeaponSet underwater1) {
        this.underwater1 = underwater1;
    }

    public WeaponSet getUnderwater2() {
        return underwater2;
    }

    public void setUnderwater2(WeaponSet underwater2) {
        this.underwater2 = underwater2;
    }

    public ArmorSet getArmorSet() {
        return armorSet;
    }

    public void setArmorSet(ArmorSet armorSet) {
        this.armorSet = armorSet;
    }

    public AccessorySet getAccessories() {
        return accessories;
    }

    public void setAccessories(AccessorySet accessories) {
        this.accessories = accessories;
    }

    public TraitSet getTraits() {
        return traits;
    }

    public void setTraits(TraitSet traits) {
        this.traits = traits;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}

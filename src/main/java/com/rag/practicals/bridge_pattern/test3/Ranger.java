package com.rag.practicals.bridge_pattern.test3;

public class Ranger extends Soldier{

    public Ranger(Weapon weapon){
        super(weapon);
    }

    @Override
    public void fire() {
        System.out.println("Ranger firing");
        weapon.shoot();
    }

    @Override
    public void pick(Weapon newWeapon) {
        System.out.println("Ranger picking");
       this.weapon = newWeapon ;
    }




}

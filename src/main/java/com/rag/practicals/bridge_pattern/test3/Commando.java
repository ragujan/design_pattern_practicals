package com.rag.practicals.bridge_pattern.test3;

public class Commando extends Soldier{
    public Commando(Weapon weapon){
        super(weapon);
    }
    @Override
    public void fire() {
        System.out.println("commondo firing");
        weapon.shoot();
    }

    @Override
    public void pick(Weapon weapon) {
        System.out.println("commondo picking ");
          this.weapon = weapon;
    }

}

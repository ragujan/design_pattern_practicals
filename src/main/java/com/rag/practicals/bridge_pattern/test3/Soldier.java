package com.rag.practicals.bridge_pattern.test3;

public abstract class Soldier {
    protected Weapon weapon;

    public Soldier(Weapon weapon){
        this.weapon = weapon;
    }

    public abstract void fire();
    public abstract void pick(Weapon weapon);
    public  void drop(

    ){
        weapon = null;
    };

}

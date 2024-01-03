package com.rag.practicals.bridge_pattern.test3;

public class BridgePattern {
    public static void main(String[] args) {
        Weapon pistol = new Pistol();
        Weapon sniper = new Sniper();

        Soldier commondo = new Commando(pistol);
        Soldier ranger = new Ranger(sniper);


        commondo.fire();
        ranger.fire();

        commondo.drop();

        ranger.fire();

        commondo.pick(sniper);
        commondo.fire();

    }
}

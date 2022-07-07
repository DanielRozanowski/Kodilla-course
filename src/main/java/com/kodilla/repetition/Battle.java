package com.kodilla.repetition;

import java.util.LinkedList;

public class Battle {

    public static void main(String[] args){
        Cannon cannon1 = new Cannon(false);
        Cannon cannon2 = new Cannon(false);
        Cannon cannon3 = new Cannon(false);
        Cannon cannon4 = new Cannon(false);
        Cannon cannon5 = new Cannon(true);

        LinkedList<Cannon> army = new LinkedList<>();

        army.add(cannon1);
        army.add(cannon2);
        army.add(cannon3);
        army.add(cannon4);
        army.add(cannon5);

        for(Cannon currentCannon: army){
            currentCannon.fire();
        }
    }
}

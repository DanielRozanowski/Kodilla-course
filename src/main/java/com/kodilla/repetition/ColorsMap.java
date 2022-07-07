package com.kodilla.repetition;

import java.util.HashMap;
import java.util.Map;

public class ColorsMap {

    public static void main(String[] args) {
        Colors color1 = new Colors(1, "black1");
        Colors color2 = new Colors(2, "black2");
        Colors color3 = new Colors(3, "black3");
        Colors color4 = new Colors(4, "red");
        Colors color5 = new Colors(5, "red2");
        Colors color6 = new Colors(6, "red3");
        Colors color7 = new Colors(7, "blue");

        Map<Integer, Colors> myColours = new HashMap<>();
        Map<Integer, Colors> myFriendColours = new HashMap<>();

        myColours.put(1, color1);
        myColours.put(2, color2);
        myColours.put(3, color3);
        System.out.println(myColours);
        myFriendColours.put(4, color4);
        myFriendColours.put(5, color5);
        myFriendColours.put(6, color6);
        myFriendColours.put(7, color7);
        System.out.println(myFriendColours);

        Map<Integer, Colors> ourColours = new HashMap<>();
        int i = 0;

        for(Colors currentColor: myColours.values()){
            i++;
            ourColours.put(i, currentColor);
        }
        for(Colors currentColor: myFriendColours.values()){
            i++;
            ourColours.put(i, currentColor);
        }
        System.out.println(ourColours);
    }
}

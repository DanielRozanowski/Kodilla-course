package com.kodilla.repetition;

import java.util.LinkedList;
import java.util.List;

public class ClockProcessor {
    public static void main(String[] args){

        Clock clock1 = new Clock(12,59);
        Clock clock2 = new Clock(10,50);
        Clock clock3 = new Clock(24,59);
        Clock clock4 = new Clock(1,50);
        Clock clock5 = new Clock(1,59);

        List<Clock> clocksList = new LinkedList<>();
        clocksList.add(clock1);
        clocksList.add(clock2);
        clocksList.add(clock3);
        clocksList.add(clock4);
        clocksList.add(clock5);

        for(Clock currentClock : clocksList){
            System.out.println(currentClock);
            currentClock.tick();
            System.out.println(currentClock);
        }
    }
}

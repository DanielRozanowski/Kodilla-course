package com.kodilla.repetition.Knight;

public class Knight {

    private Quest quest;

    public Knight(Quest quest){
        this.quest = quest;
    }

    public void play(){
        quest.process();
    }
}
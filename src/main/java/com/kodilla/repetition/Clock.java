package com.kodilla.repetition;

import java.time.LocalDate;

public class Clock {
    int hour;
    int minute;

    public Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void tick(){
        if(minute == 59){
            minute = 0;
            hour++;
        }else {
            minute++;
        }
        if(hour == 25){
            hour = 1;
        }
        System.out.println("A minute has passed.");
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHouers(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}

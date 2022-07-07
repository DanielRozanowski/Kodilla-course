package com.kodilla.repetition;

public class Cannon {
    private boolean loaded;

    public Cannon(boolean loaded){
        this.loaded = loaded;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire(){
        if(loaded){
            System.out.println("Ready?");
        } else {
            loaded = true;
            System.out.println("Ready!");
        }

    }
}

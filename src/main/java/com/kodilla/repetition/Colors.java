package com.kodilla.repetition;

public class Colors {
    private String kindOfColor;
    private int id;

    public Colors(int id, String kindOfColor){
        this.id = id;
        this.kindOfColor = kindOfColor;
    }

    public int getId(){
        return this.id = id;
    }
    public String getKindOfColor(){
        return this.kindOfColor = kindOfColor;
    }
    public int setId(){
        return id;
    }
    public String setKindOfColor(){
        return kindOfColor;
    }

    public String toString(){
        return " Color id = " + id + " Color = " + kindOfColor;
    }
    public int hashCode(){
        return id;
    }

}

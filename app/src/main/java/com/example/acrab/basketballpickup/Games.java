package com.example.acrab.basketballpickup;

/**
 * Created by acrab on 4/9/2017.
 */

public class Games {
    private int id;
    private String name;
    private int time;

    public Games(){

    }
    public Games(int id, String name, int time){
        this.id = id;
        this.name = name;
        this.time = time;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

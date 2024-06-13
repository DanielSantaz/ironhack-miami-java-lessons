package com.ironhack.w1.wednesday;

public class Movie {
    public String title;
    public int duration;


    public Movie(String title, int duration){
        this.title = title;
        this. duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }


    @Override
    public String toString(){
        return "Move( Title: " + getTitle() + " Duration: " + getDuration() + ")";
    }


    public void play(){
        System.out.println("Now playing!" + this.title);
    }


}

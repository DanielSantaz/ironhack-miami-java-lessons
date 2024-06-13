package com.ironhack.w1.thursday;

public abstract class Player {
    private double volume;
    private int currentTrack;

    public Player(int currentTrack, double volume) {
        this.currentTrack = currentTrack;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }


    public abstract void close();
}

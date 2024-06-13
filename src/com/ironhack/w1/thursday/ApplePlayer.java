package com.ironhack.w1.thursday;

public class ApplePlayer extends Player{

    public ApplePlayer(int currentTrack, double volume) {
        super(currentTrack, volume);
    }

    public void close(){
        System.out.println("Closing Apple Player....");
    }
}

package com.ironhack.w1.thursday;

public class AndriodPlayer extends Player implements IPlayable, ISharable{
    public AndriodPlayer(int currentTrack, double volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void mute() {

    }

    @Override
    public void increaseVolume() {

    }

    @Override
    public String share() {
        return "Sharing...";
    }

    @Override
    public void close() {
        System.out.println("Closing Andriod Player...");

    }
}

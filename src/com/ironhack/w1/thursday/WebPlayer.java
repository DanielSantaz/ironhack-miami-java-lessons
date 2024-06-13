package com.ironhack.w1.thursday;

public class WebPlayer extends Player implements IPlayable{
    public WebPlayer(int currentTrack, double volume) {
        super(currentTrack, volume);
    }
    public void close(){
        System.out.println("Closing Web player....");
    }

    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing...");
    }

    @Override
    public void mute() {
        setVolume(0);

    }

    @Override
    public void increaseVolume() {
        if(getVolume() < MAX_VOLUME){
            setVolume(getVolume() + 0.1);
        }
        if (getVolume() > MAX_VOLUME){
            setVolume(MAX_VOLUME);
        }


    }
}

package com.ironhack.w1.thursday;

public interface IPlayable
{

    final double MAX_VOLUME = 1;
    public abstract void play();
    void pause();
    void mute();
    void increaseVolume();
}

package ru.anton.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic(MusicEnum.ROCK);
    }
}

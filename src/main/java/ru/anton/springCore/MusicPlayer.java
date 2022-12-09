package ru.anton.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("letsGo")
public class MusicPlayer {
    Music music1;
    Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("iLoveSqwore") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicEnum value) {
        return "Playing: " + ((value == MusicEnum.CLASSICAL) ? music2.getSong() : music1.getSong());
    }
}

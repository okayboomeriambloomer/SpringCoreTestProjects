package ru.anton.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("iLoveSqwore")
public class ClassicalMusic implements Music {

    List<String> arrayOfSong = new ArrayList<>();
    {
        arrayOfSong.add("Sqwore - Давай сбежим");
        arrayOfSong.add("Sqwore - Аквариум");
        arrayOfSong.add("Sqwore - Вернуть назад");
    }
    @Override
    public String getSong() {
        return arrayOfSong.get(Math.abs(new Random().nextInt()) % 3);
    }
}

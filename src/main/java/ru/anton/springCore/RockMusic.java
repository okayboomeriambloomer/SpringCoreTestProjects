package ru.anton.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    List<String> arrayOfSong = new ArrayList<>();
    {
        arrayOfSong.add("Три дня дождя - Отпускай");
        arrayOfSong.add("Три дня дождя - Выдыхай");
        arrayOfSong.add("Три дня дождя - Не виноваты планеты");
    }
    @Override
    public String getSong() {
        return arrayOfSong.get(Math.abs(new Random().nextInt()) % 3);
    }
}

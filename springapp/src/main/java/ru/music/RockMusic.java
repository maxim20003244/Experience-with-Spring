package ru.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class RockMusic implements Music {



    @Override
    public String getMusic() {
        return "Michael Jckson";
    }
}

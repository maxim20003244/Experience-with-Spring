package ru.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music{
    /*public ClassicalMusic() {
    }

    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public int getVolume() {
        System.out.println(volume);
        return volume;
    }*/

    @Override
    public String getMusic()
    {
        return "Hungarian Rhapsody ";
    }



}

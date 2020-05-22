package ru.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class ElectricMusic implements Music {
    /*public ElectricMusic() {
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
    }
*/
    @Override
    public String getMusic() {
        return "Kazantip 2020!";
    }
}

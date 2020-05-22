package ru.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.ArrayList;


public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();



    private String name;
    private int volume;


    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        System.out.println(volume);
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public MusicPlayer() {
    }


    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing "+ music.getMusic());
        }
       /*System.out.println("Playing: " +  musicList);
    }*/
    }
}

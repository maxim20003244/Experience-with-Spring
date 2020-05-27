package ru.springIoCAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("music")
public class MusicPlayer {
    private Music music;
    private RockMusic rockMusic;
@Autowired
    public MusicPlayer(@Qualifier("classicall") Music music,RockMusic rockMusic) {
        this.music = music;
        this.rockMusic = rockMusic;
    }

    public void setMusic(@Qualifier("classicall") Music music) {
        this.music = music;
    }

    public String playMusic(){
      return music.getSong();
    }
}

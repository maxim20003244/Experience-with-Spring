package ru.music;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
    /*Music music = context.getBean("electricMusic",ElectricMusic.class);
    MusciPlayer musciPlayer = new MusciPlayer(music);*/
        MusicPlayer musicPlayer =context.getBean("listMusic",MusicPlayer.class);
  musicPlayer.getName();
  musicPlayer.getVolume();
        musicPlayer.playMusic();

    context.close();








    }
}

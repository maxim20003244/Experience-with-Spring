package ru.springIoCAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
//        Music music = context.getBean("classicall",ClassicalMusic.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music1 = context.getBean("electric", ElectricMusic.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.playMusic();
//        context.close();
      /*  MusicPlayer musicPlayer  = context.getBean("music" ,MusicPlayer.class);
        musicPlayer.playMusic();*/

        Computer computer = context.getBean("computer" , Computer.class);
        System.out.println(computer);
        context.close();
    }
}

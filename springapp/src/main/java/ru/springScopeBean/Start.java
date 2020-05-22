package ru.springScopeBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer music = context.getBean("musicPlayer" , MusicPlayer.class);
        MusicPlayer music1 = context.getBean("musicPlayer" , MusicPlayer.class);
        boolean compar = music == music1;
        System.out.println(compar);
        music.setVolume(35);
        System.out.println(music.getVolume());
        System.out.println(music1.getVolume());

        System.out.println(music);
        System.out.println(music1);

        music.playMusic();
        context.close();
    }
}

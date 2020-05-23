package ru.springIoCAnnotation;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "This is rock music!";
    }
}

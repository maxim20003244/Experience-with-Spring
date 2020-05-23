package ru.springIoCAnnotation;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricMusic implements Music{
    @Override
    public String getSong() {
        return "This is electric music";
    }
}

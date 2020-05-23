package ru.springIoCAnnotation;

import org.springframework.stereotype.Component;

@Component("classicall")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical Music ";
    }
}

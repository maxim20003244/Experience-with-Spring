package ru.springIoCAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicall")
@Scope("prototype")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical Music ";
    }
}

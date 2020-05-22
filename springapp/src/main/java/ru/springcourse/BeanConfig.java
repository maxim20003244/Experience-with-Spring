package ru.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class BeanConfig {
   @Bean
    public TestBean printname(){
        return new TestBean();
    }

}

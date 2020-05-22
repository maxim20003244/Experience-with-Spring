package ru.testbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunBeans {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExamConfig.class);
        Exam exam = context.getBean(Exam.class);
        exam.examCheck();
    }
}
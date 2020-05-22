package ru.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        TestBean testBean = context.getBean("testBean",TestBean.class);
        System.out.println(testBean.toString());
        context.close();*/

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestBean testBean1 =context1.getBean(TestBean.class);
        testBean1.setName("maximum");
        System.out.println(testBean1.toString());
        context1.close();
}

}

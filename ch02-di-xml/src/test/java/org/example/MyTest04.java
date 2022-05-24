package org.example;

import org.example.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest04 {

    @Test
    public void test(){
        String config = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);

    }

}

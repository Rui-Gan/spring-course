package org.example;

import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {

    @Test
    public void test(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);

        Student stu2 = (Student) ac.getBean("myStudent2");
        System.out.println(stu2);

        File myFile = (File) ac.getBean("myfile");
        System.out.println("myFile=" + myFile.getName());
    }

}

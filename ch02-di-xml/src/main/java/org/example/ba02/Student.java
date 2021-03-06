package org.example.ba02;

public class Student {
    private String name;
    private  int age;

    //声明一个引用类型
    private School school;

    /*
        需要有set方法，没有会报错
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setSchool:" + school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}

package com.regina.ba03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    /**
     * @Value：简单类型的属性赋值
     * 属性：value是String类型，表示简单类型的属性值
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     *      2.在set方法上
     */
    @Value(value = "张飞")
    private String name;
    @Value(value = "29")
    private int age;

    /**
     * 引用类型
     * @param name
     */


    public void setName(String name) {
        this.name = name;
    }
     @Value(value = "30")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

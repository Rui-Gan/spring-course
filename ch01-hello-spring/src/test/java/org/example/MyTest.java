package org.example;

import org.example.service.impl.someServiceImpl;
import org.example.service.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        someService service = new someServiceImpl();
        service.dosome();
    }

    /**
     * spring默认创建对象的时间：在创建spring容器时，会创建配置文件中的所有的对象。
     * spring创建对象：默认调用的是无参数构造方法。
     */

    @Test
    public void test02(){
        //使用spring容器创建对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext表示spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext：从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器获取某个对象，你要调用对象的方法
        //getBean("配置文件中bean的id值")
        someService service = (someService) ac.getBean("someservice");
        //使用spring创建好的对象
        service.dosome();
    }

    /**
     * 获取spring容器中java对象的信息
     */
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量："+nums);
        //容器中每个定义的对象的名称
        String names [] = ac.getBeanDefinitionNames();
        for(String name: names) {
            System.out.println(name);
        }
    }
    //获取一个非自定义类对象
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用getBean()
        Date my = (Date) ac.getBean("mydate");
        System.out.println("Date"+my);


    }
}

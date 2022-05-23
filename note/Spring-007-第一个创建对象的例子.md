spring是一个容器，管理对象，给属性赋值，底层是反射创建对象。


junit：单元测试，一个工具类库，做测试方法用的
单元：指定的是方法，一个类中有很多方法，一个方法称为单元。
使用单元测试
1.需要加入junit依赖
```
 <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
 </dependency>
```
2.创建测试作用的类：叫做测试类
src/test/java目录中创建类
3.创建测试方法
1）public方法
2）没有返回值 void
3）方法名称自定义，建议是test+需要测试的方法名称
4）方法没有参数
5）方法上面加入@Test，这样的方法是可以单独执行的。不用使用main方法。

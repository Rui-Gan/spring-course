- 什么是spring？
   - 一个框架，核心技术是ioc，aop，实现解耦合。
   - 一个容器，容器中存放java对象，需要把对象放入容器中
- 使用spring
   - 一个容器，把项目中的对象放入容器中
   - 让容器完成对象的创建，对象之间关系的管理（属性赋值）
   - 从容器中获取要使用的对象
- 哪些对象需要放入容器中
   - dao类，service类，controller类，工具类
      - 使用xml配置文件，使用<bean>
      - 注解
   - sprng对象默认是单例的，容器中叫这个名称对象都只有一个
- 哪些对象不放入容器
   - 实体类对象，实体类数据来自数据库
   - servlet，listener，filter等，这些由tomcat管理
- 使用spring框架的步骤
   - 加入依赖
      - <dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-context</artifactId>
  <version>5.2.5.RELEASE</version>
</dependency>
   - 创建类：接口，实现类，没有接口的类
   - 创建spring的配置文件，使用<bean>声明对象
   - 使用容器的对象，通过ApplicationContext接口和他的实现类ClassPathXmlApplicationContext的方法getBean()

 	

- 核心技术
   - ioc：控制反转
      - 一个理论，思想，概念，指导开发人员在容器中管理对象，给属性赋值，管理依赖
      - ioc技术实现使用的是di（依赖注入）：开发人员在项目中只需要提供对象名称，对象的创建，查找，赋值由容器实现
      - spring使用的di的技术，底层使用的是反射机制
      - di给属性赋值
         - set注入：spring调用类的set方法实现属性赋值
            - 简单类型	<property name="属性名" value="属性值" />
            - 引用类型	<property name="属性名" ref="bean的id" />
         - 构造注入：spring调用有参数构造
            - <constructor-arg>的name属性，name表示形参名
            - <constructor-arg>的index属性，表示构造方法形参的位置，从0开始
   - 


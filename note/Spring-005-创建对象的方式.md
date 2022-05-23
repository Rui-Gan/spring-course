- 构造方法，new Student()
- 反射
- 序列化
- 克隆
- ioc：容器创建对象
- 动态代理

ioc的体现：
servlet    1：创建类继承HttpServlet
2:   在web.xml  注册servlet，使用<servlet-name> myservlet</servlet-name>
   <servlet-class>com.bjpwernode.controller.Myservlet</servlet-class>
3：没有创建servlet对象，没有Myservlet myservlet = new Myservlet()
4：servlet 是Tomcat服务器创建的  Tomcat也称为容器
Tomcat作为容器，里面存放的有servlet对象，Listener，Filter对象


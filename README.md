sample-code
===========
这是一个用来保存一些测试代码的地方。
AOPTest
==================
我用这个工程来测试Spring AOP.主要测试了两种模式。

使用Spring 的代理模式的AOP
=====================
启用方法：
<aop:aspectj-autoproxy proxy-target-class="true" />

代理模式的AOP使用Java JDK自带的代理模式实现，但该模式仅支持接口，当给类加上AOP时，Spring会
自动加上对cglib的依赖，使用cglib的代理模式来实现。代理模式的AOP简单，但是有很大的局限性。例如
只能给public方法加上代理。同时，如果类是继承关系的话，如果方法是一个abstract方法，子类的实现
也不能工作。

使用AspectJ实现的AOP
=====================
启用方法： <context:load-time-weaver/>
使用AspectJ的AOP，需要多两步，一是在JVM启动时，加上一个agent，对于Spring，要加上spring-agent.jar。 
-javaagent:lib/spring-agent.jar
另外还要使用在META-INFO/目录下面定义一个aop.xml的文件。里面定义了使用哪个类作为Aspect。
AspectJ的AOP实现功能相对强大。能够解决proxy模式实现不了的问题。

sample-code
===========
����һ����������һЩ���Դ���ĵط���
AOPTest
==================
�����������������Spring AOP.��Ҫ����������ģʽ��

ʹ��Spring �Ĵ���ģʽ��AOP
=====================
���÷�����	<aop:aspectj-autoproxy proxy-target-class="true" />

����ģʽ��AOPʹ��Java JDK�Դ��Ĵ���ģʽʵ�֣�����ģʽ��֧�ֽӿڣ����������AOPʱ��Spring��
�Զ����϶�cglib��������ʹ��cglib�Ĵ���ģʽ��ʵ�֡�����ģʽ��AOP�򵥣������кܴ�ľ����ԡ�����
ֻ�ܸ�public�������ϴ���ͬʱ��������Ǽ̳й�ϵ�Ļ������������һ��abstract�����������ʵ��
Ҳ���ܹ�����

ʹ��AspectJʵ�ֵ�AOP
=====================
���÷����� <context:load-time-weaver/>
ʹ��AspectJ��AOP����Ҫ��������һ����JVM����ʱ������һ��agent������Spring��Ҫ����spring-agent.jar�� 
-javaagent:lib/spring-agent.jar
���⻹Ҫʹ����META-INFO/Ŀ¼���涨��һ��aop.xml���ļ������涨����ʹ���ĸ�����ΪAspect��
AspectJ��AOPʵ�ֹ������ǿ���ܹ����proxyģʽʵ�ֲ��˵����⡣

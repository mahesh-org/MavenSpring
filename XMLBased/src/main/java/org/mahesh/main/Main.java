package org.mahesh.main;

import org.mahesh.bean.Circle;
import org.mahesh.bean.Shape;
import org.mahesh.bean.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by maheshwar on 19-Jul-15.
 * 
 * Spring bean Configuration :
 * 1) XML based			- By creating a spring configuration file to configure beans. 
 * 2) Annotation based	- By using @Service or @Component annotations.
 * 3) Java based		- Starting from Spring 3.0. We can configure spring beans using java programs. 
 * 						  Some important annotations used for java based configurations are @Configuration, @ComponentScan and @bean
 * 
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("C:\\Mahesh\\MyProjects\\MavenSpring\\XMLBased\\src\\main\\resources\\applicationContext.xml"));
        Circle circle = (Circle) beanFactory.getBean("circle");
        circle.draw();

        //Triangle triangle = (Triangle) beanFactory.getBean("triangleAlias");
        //Triangle triangle = (Triangle) beanFactory.getBean("triangleInner");
        //Triangle triangle = (Triangle) beanFactory.getBean("triangle3DifferntPoints");
        //Triangle triangle = (Triangle) beanFactory.getBean("triangleCollection");
        //Triangle triangle = (Triangle) beanFactory.getBean("triangleAutowireByName");
        //Triangle triangle = (Triangle) beanFactory.getBean("triangleAutowireByConstrutor");

        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        //Triangle triangle = (Triangle) context.getBean("triangleBeanScope");
        //Triangle triangle = (Triangle) context.getBean("triangleAwareExp");
        //Triangle triangle = (Triangle) context.getBean("triangleInheritance");

        //AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        //context.registerShutdownHook();
        //Triangle triangle = (Triangle) context.getBean("triangleInheritance");
        //triangle.draw();

        /*Shape shape = (Shape) context.getBean("circleInterface");
        shape.draw();*/
    }
}

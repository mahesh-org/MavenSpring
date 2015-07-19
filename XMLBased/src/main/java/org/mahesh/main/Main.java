package org.mahesh.main;

import org.mahesh.bean.Circle;
import org.mahesh.bean.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by maheshwar on 19-Jul-15.
 */
public class Main {

    public static void main(String[] args) {
        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("E:\\git_repo\\MavenSpring\\XMLBased\\src\\main\\resources\\applicationContext.xml"));
        /*Circle circle = (Circle) beanFactory.getBean("circle");
        circle.draw();*/

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

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle) context.getBean("triangleInheritance");
        triangle.draw();
    }
}

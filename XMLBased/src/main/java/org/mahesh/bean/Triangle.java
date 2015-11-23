package org.mahesh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by maheshwar on 19-Jul-15.
 */
public class Triangle implements Shape, ApplicationContextAware, BeanNameAware {
    /*private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for(Point point:points) {
            System.out.println("Point = (" + point.getX() + " : "+ point.getY() + ")");
        }
    }*/
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context;
    public Triangle() {

    }
    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("PointA X:" + getPointA().getX() + " Y:"+getPointA().getY() );
        System.out.println("PointB X:" + getPointB().getX() + " Y:"+getPointB().getY() );
        System.out.println("PointC X:" + getPointC().getX() + " Y:"+getPointC().getY() );
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
        System.out.println("applicationContext aware from Triangle");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name:"+beanName);
    }
}

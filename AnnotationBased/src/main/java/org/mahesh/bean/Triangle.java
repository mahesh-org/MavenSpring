package org.mahesh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by maheshwar on 19-Jul-15.
 */
public class Triangle implements Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;

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
}

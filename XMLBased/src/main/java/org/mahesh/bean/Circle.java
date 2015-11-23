package org.mahesh.bean;

/**
 * Created by maheshwar on 19-Jul-15.
 */
public class Circle implements Shape {
    private String type;
    private int degree;

    Circle() {

    }
    Circle(String arg1) {
        System.out.println("arg1: "+ arg1);
        this.type = arg1;
    }

    Circle(int arg2) {
        System.out.println("arg2: "+ arg2);
        this.degree = arg2;
    }

    Circle(String arg1, int arg2) {
        System.out.println("arg1: "+ arg1 + " arg2: "+ arg2);
        this.type = arg1;
        this.degree = arg2;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public void draw() {
        System.out.println(getType() + " Circle Draw at degree "+ getDegree());
    }
}

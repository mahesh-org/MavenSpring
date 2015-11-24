package org.mahesh.bean;

import org.springframework.stereotype.Component;

/**
 * Created by maheshwar on 19-Jul-15.
 */
@Component(value = "center")
public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

package com.bot;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Юлия on 12.03.2017.
 */
public class Circle extends JPanel {
    public int x;
    public int y;
    public int r;
    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.drawOval(x-r,y-r,r,r);
        g.setColor(Color.red);
    }
}
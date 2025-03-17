package Applets;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, this is a Java Applet!", 20, 20);
    }
}

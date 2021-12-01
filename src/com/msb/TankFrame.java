package com.msb;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    public TankFrame() {
        this.setResizable(false);
        this.setSize(800, 600);
        this.setTitle("Tank War");
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Hello", 100, 100);
    }
    public static void main(String[] args) {
        TankFrame t = new TankFrame();
    }
}

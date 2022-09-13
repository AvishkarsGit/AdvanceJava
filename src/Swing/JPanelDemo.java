package Swing;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    Container c;
    JPanel panel;
    JPanelDemo()
    {
        c=getContentPane();
        panel=new JPanel();
        c.setLayout(null);
        c.setBackground(new Color(255,0,255));
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(255,153,255));
        c.add(panel);


    }
    public static void main(String[] args) {
        JPanelDemo jp = new JPanelDemo();
        jp.setSize(500,500);
        jp.setVisible(true);
    }
}

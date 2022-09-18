package Swing;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo extends JFrame {

    JButtonDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton();
        add(b1);
    }

    public static void main(String[] args) {
        JButtonDemo j1 = new JButtonDemo();
        j1.setSize(500, 500);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
package Swing;

import javax.swing.*;

public class FrameDemo extends JFrame {
    public static void main(String[] args) {
        FrameDemo f = new FrameDemo();
        f.setSize(500,500);
        f.setVisible(true);
        f.setTitle("Swing Frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

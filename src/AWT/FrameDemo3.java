package AWT;

import java.awt.*;

public class FrameDemo3 extends Frame {
    FrameDemo3()
    {
        setSize(400,500);
        setVisible(true);
        setTitle("My frame");
        setBackground(Color.BLUE);
    }
    public static void main(String[] args) {
        FrameDemo3 f3 = new FrameDemo3();
    }
}

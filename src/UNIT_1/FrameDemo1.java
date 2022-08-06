package UNIT_1;

import java.awt.*;

public class FrameDemo1 extends Frame {
    FrameDemo1(String title)
    {
        super(title);
    }
    public static void main(String[] args) {
        FrameDemo1 f1 = new FrameDemo1("UNIT-1");
        f1.setSize(400,400);
        f1.setVisible(true);
    }
}

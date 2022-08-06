package UNIT_1;

import java.awt.*;
public class LabelDemo extends Frame{
    LabelDemo()
    {
        FlowLayout f = new FlowLayout();
        setLayout(f);
        Label l = new Label("Indian");
        Label l1 = new Label("Army");
        add(l);
        add(l1);
    }
    public static void main(String[] args) {
        LabelDemo f1 = new LabelDemo();
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setTitle("My frame");
    }
}

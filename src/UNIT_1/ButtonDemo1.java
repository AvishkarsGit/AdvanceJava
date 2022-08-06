package UNIT_1;

import java.awt.*;

public class ButtonDemo1 extends Frame {
    ButtonDemo1()
    {
        FlowLayout f = new FlowLayout(FlowLayout.LEFT);
        setLayout(f);
        Button b = new Button("Ok");
        Button b1 = new Button("Cancel");
        Button b2 = new Button("Retry");
        add(b);
        add(b1);
        add(b2);
    }
    public static void main(String[] args) {
        ButtonDemo1 f1 = new ButtonDemo1();
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setTitle("My frame");
    }
}

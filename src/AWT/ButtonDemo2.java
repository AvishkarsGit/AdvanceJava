package AWT;

import java.awt.*;

public class ButtonDemo2 extends Frame {
    ButtonDemo2()
    {
        setLayout(null);
        Button b = new Button("Ok");
        b.setBounds(100,130,50,30);
        Button b1 = new Button("Cancel");
        b1.setBounds(100,170,50,30);
        Button b2 = new Button("Retry");
        b2.setBounds(100,210,50,30);
        add(b);
        add(b1);
        add(b2);
    }
    public static void main(String[] args) {
        ButtonDemo2 f1 = new ButtonDemo2();
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setTitle("My frame");
    }
}

package AWT;

import java.awt.*;

public class ButtonDemo extends Frame {
    ButtonDemo()
    {
        FlowLayout f = new FlowLayout();
        setLayout(f);
        Button b = new Button("Ok");
        Button b1 = new Button("Cancel");
        Button b2 = new Button("Retry");
        add(b);
        add(b1);
        add(b2);
    }
    public static void main(String[] args) {
        ButtonDemo f1 = new ButtonDemo();
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setTitle("My frame");
    }
}

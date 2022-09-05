package AWT;

import java.awt.*;

public class TextFieldDemo extends Frame {
    TextFieldDemo()
    {
        FlowLayout f = new FlowLayout();
        setLayout(f);
        TextField t1 = new TextField();
        TextField t2 = new TextField("Name");
        TextField t3 = new TextField("Last",20);
        add(t1);
        add(t2);
        add(t3);
        t1.setEchoChar('*');
    }
    public static void main(String[] args) {
        TextFieldDemo f1 = new TextFieldDemo();
        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setTitle("My frame");
    }
}

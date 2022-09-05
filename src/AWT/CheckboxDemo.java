package AWT;


import java.awt.*;

public class CheckboxDemo extends Frame {

    Checkbox c1,c2,c3;
    CheckboxDemo()
    {
        FlowLayout f =new FlowLayout();
        setLayout(f);
        c1 = new Checkbox("Male",true);
        c2 = new Checkbox("Female");
        c3 = new Checkbox("Other");

        add(c1);
        add(c2);
        add(c3);
    }

    public static void main(String[] args) {
        CheckboxDemo c1 = new CheckboxDemo();
        c1.setSize(500,500);
        c1.setVisible(true);
        c1.setTitle("CheckBox Demo");
    }
}

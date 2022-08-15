package UNIT_1;

import java.awt.*;

public class CheckBoxGroupDemo extends Frame {

    Checkbox c1,c2,c3;
    CheckBoxGroupDemo()
    {
        CheckboxGroup cbg =  new CheckboxGroup();
        FlowLayout f =new FlowLayout();
        setLayout(f);
        c1 = new Checkbox("Male",false,cbg);
        c2 = new Checkbox("Female",false,cbg);
        c3 = new Checkbox("Other",false,cbg);

        add(c1);
        add(c2);
        add(c3);
    }

    public static void main(String[] args) {
        CheckBoxGroupDemo c1 = new CheckBoxGroupDemo();
        c1.setSize(500,500);
        c1.setVisible(true);
        c1.setTitle("CheckBox Demo");
    }
}

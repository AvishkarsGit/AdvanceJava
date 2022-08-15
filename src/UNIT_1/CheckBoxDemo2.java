package UNIT_1;

import java.awt.*;

public class CheckBoxDemo2 extends Frame {
    Checkbox c1,c2,c3;
    CheckBoxDemo2()
    {
        c1 = new Checkbox("C Lang");
    }

    public static void main(String[] args) {
        CheckBoxDemo2 cb = new CheckBoxDemo2();
        cb.setSize(600,600);
        cb.setVisible(true);
    }
}

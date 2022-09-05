package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxGroupDemo1 extends Frame implements ItemListener {
    Checkbox c1,c2,c3;
    Label l1;
    CheckboxGroup cbg;
    CheckBoxGroupDemo1()
    {
        cbg =  new CheckboxGroup();
        FlowLayout f =new FlowLayout();
        setLayout(f);
        c1 = new Checkbox("Male",false,cbg);
        c2 = new Checkbox("Female",false,cbg);
        c3 = new Checkbox("Other",false,cbg);
        l1 = new Label("                                                                                               ");

        add(c1);
        add(c2);
        add(c3);
        add(l1);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);


    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox result;
        result = cbg.getSelectedCheckbox();
        String str = result.getLabel();
        l1.setText("You Have entered :"+str);
    }
    public static void main(String[] args) {
        CheckBoxGroupDemo1 c1 = new CheckBoxGroupDemo1();
        c1.setSize(500,500);
        c1.setVisible(true);
        c1.setTitle("CheckBox Demo");
    }


}

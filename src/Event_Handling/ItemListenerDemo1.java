package Event_Handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo1 extends JFrame implements ItemListener {

    JRadioButton jb,jb1;
    ButtonGroup  bg;
    Container c;
    ItemListenerDemo1()
    {
        c=getContentPane();
        setLayout(new FlowLayout());
        jb = new JRadioButton("Male");
        jb1 = new JRadioButton("Female");
        bg=new ButtonGroup();
        c.add(jb);
        c.add(jb1);
        bg.add(jb);
        bg.add(jb1);
        jb.addItemListener(this);
        jb1.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent e){
        if (e.getSource()==jb){
            JOptionPane.showMessageDialog(this,"You are Male");
        }
        else if (e.getSource()==jb1){
            JOptionPane.showMessageDialog(this,"You are Female");
        }
    }
    public static void main(String[] args) {
        ItemListenerDemo1 i = new ItemListenerDemo1();
        i.setSize(500,500);
        i.setVisible(true);
        i.setTitle("Radio Button");
        i.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


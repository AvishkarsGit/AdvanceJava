package Event_Handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo2 extends JFrame implements ItemListener {

    JCheckBox j1,j2;
    ButtonGroup  bg;
    Container c;
    ItemListenerDemo2()
    {
        c=getContentPane();
        setLayout(new FlowLayout());
        j1 = new JCheckBox("Male");
        j2 = new JCheckBox("Female");
        bg=new ButtonGroup();
        c.add(j1);
        c.add(j2);
        j1.addItemListener(this);
        j2.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent e){
        if (e.getSource()==j1){
            JOptionPane.showMessageDialog(this,"You are Male");
        }
        else if (e.getSource()==j2){
            JOptionPane.showMessageDialog(this,"You are Female");
        }
    }
    public static void main(String[] args) {
        ItemListenerDemo2 i = new ItemListenerDemo2();
        i.setSize(500,500);
        i.setVisible(true);
        i.setTitle("Radio Button");
        i.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


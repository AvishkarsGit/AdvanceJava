package Event_Handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerDemo extends JFrame implements ItemListener {

    JComboBox jb;
    JLabel l1;
    ItemListenerDemo()
    {
        setLayout(new FlowLayout());
        String country[]={"India","Aus","Afgan","England"};
        jb =new JComboBox(country);
        jb.setBounds(100,100,100,40);
//        JLabel l1 = new JLabel("                                              ");
//        l1.setBounds(250,80,200,40);
        add(jb);
        jb.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent e){
        String text =jb.getSelectedItem().toString();
        JOptionPane.showMessageDialog(this,"You have selected :"+text);
    }
    public static void main(String[] args) {
        ItemListenerDemo i = new ItemListenerDemo();
        i.setSize(500,500);
        i.setVisible(true);
        i.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEventHandling extends Frame implements ItemListener {

    Label l1;
    Choice c;
    ChoiceEventHandling()
    {


        setLayout(null);
        setBackground(Color.yellow);
        l1 = new Label("                                                        ");
        c = new Choice();
        c.setBounds(100,100,160,30);
        l1.setBounds(100,150,250,30);


        c.add("Karad");
        c.add("Sangli");
        c.add("Satara");
        c.add("Kolhapur");

        add(c);
        add(l1);
        c.addItemListener(this);


    }
    public void itemStateChanged(ItemEvent Ie)
    {
        String str=c.getSelectedItem();
        l1.setText("You Have Selected :"+str);

        l1.setFont(new Font("Times new Roman",Font.BOLD,15));

    }
    public static void main(String[] args) {
        ChoiceEventHandling c1 = new ChoiceEventHandling();
        c1.setSize(500,500);
        c1.setVisible(true);
        c1.setTitle("Choice Demo 2");
    }
}

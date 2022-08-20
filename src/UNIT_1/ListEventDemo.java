package UNIT_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;


public class ListEventDemo extends Frame implements ActionListener {

    List l1,l2;
    Label L1,L2;
    Button b1;

    ListEventDemo()
    {
        setLayout(null);
        l1=new List(4,true);
        l2=new List(3,true);
        L1=new Label("                                                          ");
        L2=new Label("                                                          ");
        b1=new Button("SHOW");
        l1.add("Karad");
        l1.add("Kolhapur");
        l1.add("Satara");
        l1.add("Kargil");
        l1.add("Beed");
        l1.add("Sambhajinagar");
        l1.add("ShivajiNagar");
        l1.add("Islampur");
        l1.add("Sangli");

        l2.add("India");
        l2.add("England");
        l2.add("Pakistan");
        l2.add("Australia");
        l2.add("West indees");
        l2.add("New-Zeland");
        l2.add("Taliban");
        l2.add("Honkong");
        l2.add("China");

        l1.setBounds(50,50,150,70);
        l2.setBounds(50,220,150,70);
        L1.setBounds(50,150,200,40);
        L2.setBounds(50,310,400,40);
        b1.setBounds(90,380,40,40);
        add(l1);
        add(l2);
        add(L1);
        add(L2);
        add(b1);
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        int i;
        String states=l1.getSelectedItem();
        String country[]=l2.getSelectedItems();
        String str = "";

        L1.setText("You have Select:"+states);
        for (i=0;i<country.length;i++)
        {
            str=str+country[i]+"   ";
        }
        L2.setText("Select Countries:"+str);
    }
    public static void main(String[] args) {
        ListEventDemo l = new ListEventDemo();
        l.setSize(600,600);
        l.setVisible(true);
        l.setTitle("List Event Demo");
    }


}

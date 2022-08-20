package UNIT_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListEventDemo1 extends Frame implements ActionListener {

    List L1;
    Label label1,label2;
    TextField t1;
    Button b1;
    ListEventDemo1()
    {
        setLayout(null);
        L1=new List(4);
        label1=new Label("Enter Index Number:");
        label2=new Label("                          ");
        t1=new TextField(50);
        b1=new Button("Show");

        L1.add("Karad");
        L1.add("Kolhapur");
        L1.add("Satara");
        L1.add("Kargil");
        L1.add("Beed");
        L1.add("Sambhajinagar");
        L1.add("ShivajiNagar");
        L1.add("Islampur");
        L1.add("Sangli");

        L1.setBounds(150,100,150,90);
        label1.setBounds(100,210,150,30);
        label2.setBounds(100,250,150,40);
        t1.setBounds(270,210,100,40);
        b1.setBounds(150,280,50,50);

        add(L1);
        add(label1);
        add(label2);
        add(t1);
        add(b1);
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        int index_no=Integer.parseInt(t1.getText());
        String text=L1.getItem(index_no);
        label2.setText(text);
    }

    public static void main(String[] args) {
        ListEventDemo1 l1 = new ListEventDemo1();
        l1.setSize(600,600);
        l1.setVisible(true);
    }
}

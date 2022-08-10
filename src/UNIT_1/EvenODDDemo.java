package UNIT_1;

import java.awt.*;
import java.awt.event.*;

public class EvenODDDemo extends Frame implements ActionListener{

    Label l1,l2;
    Button b1;
    TextField t1,t2;
    EvenODDDemo()
    {
        setLayout(null);
        setBackground(Color.ORANGE);
        l1 = new Label("Enter Number:");
        l2 = new Label("Result:");
        b1 = new Button("Result");
        t1 = new TextField(50);
        t2 = new TextField(50);

        l1.setBounds(150,90,150,50);
        l2.setBounds(150,120,150,50);
        b1.setBounds(190,190,150,35);
        t1.setBounds(300,100,150,25);
        t2.setBounds(300,130,150,25);

        l1.setFont(new Font("Arial black",Font.BOLD,15));
        l2.setFont(new Font("Arial black",Font.BOLD,15));
        b1.setFont(new Font("Arial black",Font.BOLD,15));
        t1.setFont(new Font("Arial black",Font.BOLD,15));
        t2.setFont(new Font("Arial black",Font.BOLD,15));
        b1.setBackground(Color.cyan);

        add(l1);
        add(l2);
        add(b1);
        add(t1);
        add(t2);
        b1.addActionListener(this);
    }
     public void actionPerformed(ActionEvent ae)
    {
        int no = Integer.parseInt(t1.getText());
        if (no%2==0)
        {
            t2.setText("EVEN");
        }
        else
        {
            t2.setText("ODD");
        }

    }
    public static void main(String[] args) {
        EvenODDDemo e1 =new EvenODDDemo();
        e1.setSize(500,500);
        e1.setTitle("Even ODD");
        e1.setVisible(true);
    }
}

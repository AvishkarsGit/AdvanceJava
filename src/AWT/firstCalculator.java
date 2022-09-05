package AWT;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstCalculator extends Frame implements ActionListener {
    Label l1,l2,l3;
    Button b1,b2,b3,b4,b5;
    TextField t1,t2,t3;
    firstCalculator()
    {
        setLayout(null);
        setBackground(Color.ORANGE);
        l1 = new Label("1st Number:");
        l2 = new Label("2nd Number:");
        l3 = new Label("Result:");
        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("DIV");
        b5 = new Button("CLEAR");
        t1 = new TextField(50);
        t2 = new TextField(50);
        t3 = new TextField(50);

        l1.setBounds(150,90,150,50);
        l2.setBounds(150,120,150,50);
        l3.setBounds(150,150,150,50);
        b1.setBounds(150,220,50,50);
        b2.setBounds(210,220,50,50);
        b3.setBounds(270,220,50,50);
        b4.setBounds(330,220,50,50);
        b5.setBounds(390,220,50,50);
        t1.setBounds(300,100,150,25);
        t2.setBounds(300,130,150,25);
        t3.setBounds(300,160,150,25);

        l1.setFont(new Font("Arial black",Font.BOLD,15));
        l2.setFont(new Font("Arial black",Font.BOLD,15));
        l3.setFont(new Font("Arial black",Font.BOLD,15));
        b1.setFont(new Font("Arial black",Font.BOLD,15));
        t1.setFont(new Font("Arial black",Font.BOLD,15));
        t2.setFont(new Font("Arial black",Font.BOLD,15));
        t3.setFont(new Font("Arial black",Font.BOLD,15));

        b1.setBackground(Color.cyan);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.gray);
        b4.setBackground(Color.yellow);
        b5.setBackground(Color.white);

        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(t1);
        add(t2);
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int z;
        if (e.getSource()==b1)
        {
            z = a + b;
            t3.setText(""+z);
        }
        else if (e.getSource() == b2)
        {
            z = a - b;
            t3.setText(""+z);
        }
        else if (e.getSource() == b3)
        {
            z = a * b;
            t3.setText(""+z);
        }
        else if (e.getSource() == b4)
        {
            z = a / b;
            t3.setText(""+z);
        }
        else if (e.getSource() == b5)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args) {
        firstCalculator fc = new firstCalculator();
        fc.setSize(600,350);
        fc.setVisible(true);
        fc.setTitle("first Calculator");
    }
}

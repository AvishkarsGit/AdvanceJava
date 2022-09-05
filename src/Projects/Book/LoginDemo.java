package Projects.Book;

import java.awt.*;
import java.awt.event.*;

public class LoginDemo extends Frame implements ActionListener {

    Label l1,l2,l3;
    TextField t1,t2;
    Button b1,b2;
    LoginDemo()
    {
        setLayout(null);
        setBackground(Color.ORANGE);
        l1=new Label("Book Shop Inventory");
        l1.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,16));
        l2=new Label("UserName:");
        l2.setFont(new Font("Times New Roman",Font.BOLD,14));
        l3=new Label("Password:");
        l3.setFont(new Font("Times New Roman",Font.BOLD,14));
        t1=new TextField(50);
        t2=new TextField(50);
        b1=new Button("Login");
        b1.setFont(new Font("Times New Roman",Font.BOLD,12));
        b2=new Button("Clear");
        b2.setFont(new Font("Times New Roman",Font.BOLD,12));

        l1.setBounds(150,50,250,30);
        l2.setBounds(100,100,100,30);
        l3.setBounds(100,150,100,30);
        t1.setBounds(220,100,150,30);
        t2.setBounds(220,150,150,30);
        b1.setBounds(130,200,50,30);
        b2.setBounds(250,200,50,30);

        b1.setBackground(Color.cyan);
        b2.setBackground(Color.cyan);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public static void main(String[] args) {

        LoginDemo l1 = new LoginDemo();
        l1.setSize(450,300);
        l1.setVisible(true);
        l1.setTitle("Login");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1)
        {
           if (t1.getText().equals("Avishkar") && t2.getText().equals("pass@123"))
           {
            Frame f1 = new Frame();
            f1.setSize(500,500);
            f1.setVisible(true);
            f1.setTitle("Next");

            }
           else {
               Frame f1 = new Frame();
               f1.setSize(500,500);
               f1.setVisible(false);
               f1.setTitle("Next");
           }
        }
        else if (e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
        }
    }
}

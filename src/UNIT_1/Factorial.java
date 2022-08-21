package UNIT_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial extends Frame implements ActionListener {

    Label l1,l2,l3;
    Button b1,b2;
    TextField t1,t2;
    Factorial()
    {
        setLayout(null);
        setBackground(Color.orange);

        l1=new Label("Enter Number");
        l2=new Label("Result");
        l3=new Label("      *** Factorial Of Number ***");
        t1=new TextField(50);
        t2=new TextField(50);
        b1=new Button("Factorial");
        b2=new Button("Clear");

        l1.setBounds(100,100,100,30);
        l2.setBounds(100,130,100,30);
        l3.setBounds(150,50,250,35);
        t1.setBounds(210,100,80,30);
        t2.setBounds(210,140,80,30);
        b1.setBounds(140,180,80,40);
        b2.setBounds(230,180,80,40);
        b1.setBackground(Color.cyan);
        b2.setBackground(Color.cyan);

        l1.setFont(new Font("Times New Roman",Font.BOLD,15));
        l2.setFont(new Font("Times New Roman",Font.BOLD,15));
        l3.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,15));
        l3.setBackground(Color.yellow);
        t1.setFont(new Font("Times New Roman",Font.BOLD,15));
        t2.setFont(new Font("Times New Roman",Font.BOLD,15));
        b1.setFont(new Font("Times New Roman",Font.BOLD,15));
        b2.setFont(new Font("Times New Roman",Font.BOLD,15));
        b1.setForeground(Color.BLACK);
        b2.setForeground(Color.BLACK);


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

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getActionCommand().equals("Factorial"))
        {
            int no=Integer.parseInt(t1.getText());
            int fact=1;
            String factorial;
            int i;
            for (i=1;i<=no;i++)
            {
                fact=fact*i;
            }
            t2.setText(String.valueOf(fact));
        }
        else if (ae.getActionCommand().equals("Clear")){
            t1.setText("");
            t2.setText("");
        }
    }
    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        f1.setSize(500,300);
        f1.setVisible(true);
        f1.setTitle("Factorial");
    }
}

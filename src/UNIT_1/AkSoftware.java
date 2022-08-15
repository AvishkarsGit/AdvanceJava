package UNIT_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AkSoftware extends Frame implements ActionListener {

    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    Button b1,b2;
    Checkbox c1,c2;
    CheckboxGroup cbg;
    TextField t1,t2,t3,t4;
    AkSoftware()
    {
        setLayout(null);
        setBackground(Color.ORANGE);

        cbg = new CheckboxGroup();


        //Create required  Components

        l1=new Label("    AK Software PVT.LTD");
        l2=new Label("Enter Name:");
        l3=new Label("Gender:");
        l4=new Label("Mobile No:");
        l5=new Label("City:");
        l6=new Label("                                                                    ");
        l7=new Label("NAME");
        l8=new Label("GENDER");
        l9=new Label("MOBILE NO");
        l10=new Label("CITY");
        l11=new Label("                  ");
        l12=new Label("                  ");
        l13=new Label("                  ");
        l14=new Label("                  ");
        b1=new Button("SUBMIT");
        b2=new Button("CLEAR");
        c1=new Checkbox("Male",false,cbg);
        c2=new Checkbox("Female",false,cbg);
        t1=new TextField(70);
        t2=new TextField(70);
        t3=new TextField(70);

        /*
        ---------------------------------------------
        Arranging all components in proper Manner
         */

        l1.setBounds(170,60,240,20);
        l2.setBounds(130,100,130,30);
        l3.setBounds(130,140,130,30);
        l4.setBounds(130,180,130,30);
        l5.setBounds(130,220,130,20);
        b1.setBounds(160,270,100,30);
        b2.setBounds(280,270,100,30);
        c1.setBounds(270,140,150,30);
        c2.setBounds(420,140,200,30);
        t1.setBounds(270,100,150,30);
        t2.setBounds(270,180,150,30);
        t3.setBounds(270,220,150,30);
        l6.setBounds(100,330,300,20);
        l7.setBounds(100,420,150,20);
        l8.setBounds(250,420,150,20);
        l9.setBounds(450,420,100,20);
        l10.setBounds(650,420,100,20);
        l11.setBounds(100,450,150,20);
        l12.setBounds(250,450,150,20);
        l13.setBounds(450,450,100,20);
        l14.setBounds(650,450,100,20);

        // Add all components on Frame

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(b1);
        add(b2);
        add(c1);
        add(c2);
        add(t1);
        add(t2);
        add(t3);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        b1.addActionListener(this);
        b2.addActionListener(this);

        //Set the fonts

        l1.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,20));
        l2.setFont(new Font("Times New Roman",Font.BOLD,15));
        l3.setFont(new Font("Times New Roman",Font.BOLD,15));
        l4.setFont(new Font("Times New Roman",Font.BOLD,15));
        l5.setFont(new Font("Times New Roman",Font.BOLD,15));
        l6.setFont(new Font("Times New Roman",Font.BOLD,15));
        l7.setFont(new Font("Times New Roman",Font.BOLD,15));
        l8.setFont(new Font("Times New Roman",Font.BOLD,15));
        l9.setFont(new Font("Times New Roman",Font.BOLD,15));
        l10.setFont(new Font("Times New Roman",Font.BOLD,15));
        l11.setFont(new Font("Times New Roman",Font.BOLD,15));
        l12.setFont(new Font("Times New Roman",Font.BOLD,15));
        l13.setFont(new Font("Times New Roman",Font.BOLD,15));
        l14.setFont(new Font("Times New Roman",Font.BOLD,15));
        t1.setFont(new Font("Times New Roman",Font.BOLD,15));
        t2.setFont(new Font("Times New Roman",Font.BOLD,15));
        t3.setFont(new Font("Times New Roman",Font.BOLD,15));
        b1.setFont(new Font("Times New Roman",Font.BOLD,15));
        b2.setFont(new Font("Times New Roman",Font.BOLD,15));

        l11.setForeground(Color.RED);
        l12.setForeground(Color.RED);
        l13.setForeground(Color.RED);
        l14.setForeground(Color.RED);


        l1.setBackground(Color.yellow);
        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);

    }

    // Add Event on Components
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1) {
            String name = t1.getText();
            String gender = cbg.getSelectedCheckbox().getLabel();
            String mobile = t2.getText();
            String City = t3.getText();


            l6.setText("Your record Submitted Successfully..");
            l6.setBackground(Color.yellow);

            l11.setText(name);
            l12.setText(gender);
            l13.setText(mobile);
            l14.setText(City);
        }
        else if (ae.getSource() == b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");

            l6.setText("");
            l6.setBackground(Color.orange);
            l11.setText("");
            l12.setText("");
            l13.setText("");
            l14.setText("");

        }
    }
    public static void main(String[] args) {

        // Make Window Frame

        AkSoftware a1 = new AkSoftware();
        a1.setSize(800,600);
        a1.setTitle("Ak Software");
        a1.setVisible(true);
    }

}

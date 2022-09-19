package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLoginForm extends JFrame implements ActionListener, ItemListener {
    JLabel label1, uname,pass;
    JButton b1,b2;
    JTextField t1;
    JPasswordField password;
    JCheckBox cb;
    Container c;
    JLoginForm()
    {
        c = getContentPane();
        label1 = new JLabel("**** LOGIN FORM ****");
        uname = new JLabel("Enter UserName:");
        pass = new JLabel("Enter Password:");
        t1 = new JTextField(50);
        password = new JPasswordField(50);
        cb = new JCheckBox("Show Password");
        b1 = new JButton("Login");
        b2 = new JButton("Clear");

        c.setLayout(null);
        c.setBackground(new Color(255,0,255));

        label1.setBounds(160,60,200,30);
        uname.setBounds(100,100,130,30);
        pass.setBounds(100,150,130,30);
        t1.setBounds(250,100,130,30);
        password.setBounds(250,150,130,30);
        cb.setBounds(250,190,130,30);
        b1.setBounds(140,240,90,30);
        b2.setBounds(250,240,90,30);

        label1.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC,18 ));
        uname.setFont(new Font("Times New Roman", Font.BOLD,15 ));
        pass.setFont(new Font("Times New Roman", Font.BOLD,15 ));
        t1.setFont(new Font("Times New Roman", Font.BOLD,15 ));
        password.setFont(new Font("Times New Roman", Font.BOLD,15 ));
        b1.setFont(new Font("Times New Roman", Font.BOLD,15 ));
        b2.setFont(new Font("Times New Roman", Font.BOLD,15 ));


        c.add(label1);
        c.add(uname);
        c.add(pass);
        c.add(t1);
        c.add(password);
        c.add(b1);
        c.add(b2);
        c.add(cb);
        b1.addActionListener(this);
        b2.addActionListener(this);
        cb.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Uname,Pass;
        Uname=t1.getText();
        Pass=password.getText();
        if (e.getActionCommand().equals("Login")){
            if (Uname.equals("Avishkar")&& Pass.equals("pass@123")){
                JOptionPane.showMessageDialog(this,"Login Successful..");
            }
            else{
                JOptionPane.showMessageDialog(this,"Login Fail!!");
            }
        }
        else if (e.getActionCommand().equals("Clear")){
                t1.setText("");
                password.setText("");
        }
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (cb.isSelected()){
            password.setEchoChar((char)0);
        }
        else{
            password.setEchoChar('.');
        }
    }
    public static void main(String[] args) {
        JLoginForm j1 = new JLoginForm();
        j1.setSize(500,500);
        j1.setTitle("Login Form");
        j1.setVisible(true);
        j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

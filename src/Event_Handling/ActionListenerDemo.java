package Event_Handling;

import Swing.JPanelDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerDemo extends JFrame implements ActionListener{


    JLabel label1, uname,pass;
    JButton b1,b2;
    JTextField t1;
    JPasswordField password;
    Container c;
    ActionListenerDemo() {
        c = getContentPane();
        label1 = new JLabel("**** LOGIN FORM ****");
        uname = new JLabel("Enter UserName:");
        pass = new JLabel("Enter Password:");
        t1 = new JTextField(50);
        password = new JPasswordField(50);
        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        c.setLayout(null);
        c.setBackground(new Color(255, 0, 255));

        label1.setBounds(160, 60, 200, 30);
        uname.setBounds(100, 100, 130, 30);
        pass.setBounds(100, 150, 130, 30);
        t1.setBounds(250, 100, 130, 30);
        password.setBounds(250, 150, 130, 30);
        b1.setBounds(140, 200, 90, 30);
        b2.setBounds(250, 200, 90, 30);

        label1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        uname.setFont(new Font("Times New Roman", Font.BOLD, 15));
        pass.setFont(new Font("Times New Roman", Font.BOLD, 15));
        t1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        password.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b2.setFont(new Font("Times New Roman", Font.BOLD, 15));


        c.add(label1);
        c.add(uname);
        c.add(pass);
        c.add(t1);
        c.add(password);
        c.add(b1);
        c.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Login")){
            String username,pass1;
            username=t1.getText();
            pass1=password.getText();
            if (username.equals("Avishkar") && pass1.equals("pass@123")){
                JOptionPane.showMessageDialog(this,"login succeeed..");
            }
            else {
                JOptionPane.showMessageDialog(this,"Login Fail");
            }
        } else if (e.getActionCommand().equals("Clear")) {
            t1.setText("");
            password.setText("");
        }
    }
    public static void main(String[] args) {
        ActionListenerDemo al = new ActionListenerDemo();
        al.setSize(500,500);
        al.setVisible(true);
        al.setTitle("Action Listener Demo");
    }
}

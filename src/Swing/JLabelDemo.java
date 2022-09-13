package Swing;

import javax.swing.*;
import java.awt.*;
public class JLabelDemo extends JFrame {

    JLabelDemo()
    {
        Container c =getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon ii =  new ImageIcon("C:/Users/AvishkarKumbhar/Desktop/KESP_LOGO.jpeg");

       JLabel l1=new JLabel("This is Image");
       JLabel l2 = new JLabel(ii);
       c.add(l1);
       c.add(l2);

    }


    public static void main(String[] args) {
        JLabelDemo j1 = new JLabelDemo();
        j1.setSize(500,500);
        j1.setVisible(true);
        j1.setTitle("JLabel Demo");
    }
}

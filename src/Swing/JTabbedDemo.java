package Swing;

import javax.swing.*;
import java.awt.*;

class panel1 extends JPanel{
    panel1()
    {
        setLayout(new FlowLayout());
        add(new JButton("ok"));
        add(new JButton("Retry"));
        add(new JButton("Cancel"));
    }
}
class panel2 extends JPanel{
    panel2()
    {
        setLayout(new FlowLayout());
        add(new JRadioButton("Male"));
        add(new JRadioButton("Female"));
        add(new JRadioButton("Other"));
    }
}
class panel3 extends JPanel{
    panel3()
    {
        setLayout(new FlowLayout());
        add(new JTextField(50));
        add(new JTextField(50));
        add(new JTextField(50));
    }
}
public class JTabbedDemo extends JFrame {
    JTabbedDemo()
    {
        Container c=getContentPane();
        panel1 p1 = new panel1();
        panel2 p2 = new panel2();
        panel3 p3 = new panel3();

        JTabbedPane jpt = new JTabbedPane();
        jpt.addTab("Tab1",p1);
        jpt.addTab("Tab2",p2);
        jpt.addTab("Tab3",p3);

        c.add(jpt);
    }
    public static void main(String[] args) {
        JTabbedDemo t1 = new JTabbedDemo();
        t1.setSize(500,500);
        t1.setVisible(true);
    }
}

package Swing;

import javax.swing.*;
import java.awt.*;

public class JToolTipDemo extends JFrame{
    JToolTipDemo()
    {
        Container c = getContentPane();
        setLayout(new FlowLayout());
        JButton b1 = new JButton("Click");

        c.add(b1);
        JToolTip t =new JToolTip();
        t.setToolTipText("This is click button");
        c.add(t);
    }

    public static void main(String[] args) {
        JToolTipDemo t1 = new JToolTipDemo();
        t1.setSize(500,500);
        t1.setVisible(true);
    }
}

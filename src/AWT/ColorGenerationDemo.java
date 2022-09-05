package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorGenerationDemo extends Frame implements ActionListener {
    Button b1,b2,b3;
    ColorGenerationDemo()
    {
        setLayout(null);
        b1 = new Button("YELLOW");
        b2 = new Button("GREEN");
        b3 = new Button("RED");

        b1.setBounds(150,100,70,40);
        b1.setBackground(Color.yellow);
        b2.setBounds(230,100,70,40);
        b2.setBackground(Color.GREEN);
        b3.setBounds(310,100,70,40);
        b3.setBackground(Color.RED);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1){
            setBackground(Color.YELLOW);
        }
        else if (ae.getSource() == b2){
            setBackground(Color.GREEN);
        }
        else if (ae.getSource() == b3){
            setBackground(Color.RED);
        }
    }
    public static void main(String[] args) {
        ColorGenerationDemo c1 = new ColorGenerationDemo();
        c1.setSize(500,500);
        c1.setVisible(true);
        c1.setTitle("Color Generation");
    }
}

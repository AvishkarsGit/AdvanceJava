package Swing;

import javax.swing.*;
import java.awt.*;

public class JProgressBarDemo extends JFrame {
    JProgressBar jpb;
    JProgressBarDemo()
    {
        Container c=getContentPane();
        setLayout(null);
        c.setBackground(Color.ORANGE);
        jpb=new JProgressBar(0,2000);
        jpb.setBounds(150,150,200,20);
        jpb.setStringPainted(true);
        c.add(jpb);
        jpb.setBackground(Color.black);
    }
    void setProgressBarValue()
    {
        int i=0;
        while (i<=2000){
            jpb.setValue(i);
            i=i+20;
            try{
                Thread.sleep(50);
            }catch (Exception e){}
        }
    }
    public static void main(String[] args) {
        JProgressBarDemo jp = new JProgressBarDemo();
        jp.setSize(500,500);
        jp.setVisible(true);
        jp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jp.setProgressBarValue();
    }
}

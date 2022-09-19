package Event_Handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends JFrame implements KeyListener {
    Container c;
    JTextArea t1;
    KeyListenerDemo(){
        c=getContentPane();
        c.setLayout(null);
        t1=new JTextArea(20,20);
        t1.setBounds(10,10,300,300);
        c.add(t1);
        t1.setFont(new Font("Times New Roman",Font.BOLD,15));
        t1.addKeyListener(this);

    }

    public static void main(String[] args) {
        KeyListenerDemo k1 = new KeyListenerDemo();
        k1.setSize(500,500);
        k1.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        t1.setText("\n"+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        t1.setText("\n"+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        t1.setText("\ns"+e.getKeyChar());
    }
}

package Event_Handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerDemo extends JFrame implements MouseMotionListener {

    MouseMotionListenerDemo(){
        addMouseMotionListener(this);
    }


    public static void main(String[] args) {
        MouseMotionListenerDemo m1 = new MouseMotionListenerDemo();
        m1.setSize(500,500);
        m1.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g =getGraphics();
        g.setColor(Color.RED);
        g.drawLine(e.getX(),e.getY(),10,10);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

package UNIT_1;

import java.awt.*;

public class ScrollBarDemo extends Frame {

    ScrollBarDemo()
    {
        setLayout(null);
        Scrollbar sb = new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
        Scrollbar sb1 = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);
        add(sb);
        add(sb1);
        sb.setBounds(450,10,10,450);
        sb1.setBounds(10,450,450,10);

    }
    public static void main(String[] args) {
        ScrollBarDemo s1 = new ScrollBarDemo();
        s1.setSize(500,500);
        s1.setVisible(true);

    }
}

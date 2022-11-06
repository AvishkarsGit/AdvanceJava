package Swing;

import javax.swing.*;
import java.awt.*;

public class JTabelDemo extends JFrame {
    JTabelDemo()
    {
        Container c = getContentPane();

        String colname[]={"Roll NO","Name","Marks"};
        String data[][]={{"1010","Dennis","89.90"},{"1011","Bjarne","90"},{"1012","James","87"},{"1010","Dennis","89.90"},{"1011","Bjarne","90"},{"1012","James","87"}};

        JTable jt = new JTable(data,colname);

        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        JScrollPane jsp = new JScrollPane(jt,v,h);
        c.add(jsp);
    }
    public static void main(String[] args) {
        JTabelDemo s1 = new JTabelDemo();
        s1.setSize(500,500);
        s1.setVisible(true);
    }
}

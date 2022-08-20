package UNIT_1;

import java.awt.*;

public class ListDemo extends Frame {

    List l1;
    ListDemo()
    {

        setLayout(new FlowLayout());
        l1=new List(4);

        l1.add("Karad");
        l1.add("Kolhapur");
        l1.add("Satara");
        l1.add("Kargil");
        l1.add("Beed");
        l1.add("Sambhajinagar");
        l1.add("ShivajiNagar");
        l1.add("Islampur");
        l1.add("Sangli");

        add(l1);

    }
    public static void main(String[] args) {
        ListDemo l = new ListDemo();
        l.setSize(500,500);
        l.setVisible(true);
    }
}

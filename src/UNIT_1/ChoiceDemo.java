package UNIT_1;

import java.awt.*;

public class ChoiceDemo extends Frame {

    ChoiceDemo()
    {

        setBackground(Color.yellow);
        setLayout(new FlowLayout());
        Choice c = new Choice();
        c.add("Karad");
        c.add("Sangli");
        c.add("Satara");
        c.add("Kolhapur");

        add(c);
    }

    public static void main(String[] args) {
        ChoiceDemo c1 = new ChoiceDemo();
        c1.setSize(500,500);
        c1.setVisible(true);
        c1.setTitle("Choice Demo");
    }
}

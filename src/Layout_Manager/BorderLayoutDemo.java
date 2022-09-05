package Layout_Manager;

import java.awt.*;

public class BorderLayoutDemo extends Frame {

    BorderLayoutDemo()
    {
        BorderLayout bl = new BorderLayout(10,10);
        setLayout(bl);
        setBackground(Color.cyan);

        add(new Button("NORTH"),BorderLayout.NORTH);
        add(new Button("SOUTH"),BorderLayout.SOUTH);
        add(new Button("EAST"),BorderLayout.EAST);
        add(new Button("WEST"),BorderLayout.WEST);
        add(new TextArea(),BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        BorderLayoutDemo b1  = new BorderLayoutDemo();
        b1.setSize(500,500);
        b1.setVisible(true);
        b1.setTitle("Border Layout Demo");
    }
}

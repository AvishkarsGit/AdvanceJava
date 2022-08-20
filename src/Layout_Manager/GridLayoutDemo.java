package Layout_Manager;

import java.awt.*;

public class GridLayoutDemo extends Frame {

    Frame f1;

    GridLayoutDemo()
    {
        f1=new Frame();
        setVisible(true);
        setSize(500,500);
        setTitle("Grid Layout Demo");

        GridLayout g1 = new GridLayout(5,2,10,4);
        setLayout(g1);
        for (int i=1;i<=25;i++)
        {
            add(new Button("Button "+i));
        }
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}

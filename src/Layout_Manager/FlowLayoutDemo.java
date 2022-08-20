package Layout_Manager;

import java.awt.*;

public class FlowLayoutDemo extends Frame {

    Button b1,b2,b3;
    FlowLayoutDemo()
    {
        FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT,10,30);
        setLayout(f1);

        b1=new Button("OK");
        b2=new Button("RETRY");
        b3=new Button("CANCEL");
        add(b1);
        add(b2);
        add(b3);
    }

    public static void main(String[] args) {
        FlowLayoutDemo f1 = new FlowLayoutDemo();
        f1.setSize(500,500);
        f1.setTitle("Flow Layout");
        f1.setVisible(true);
    }
}

package Layout_Manager;

import java.awt.*;

public class DialogeDemo extends Frame {
    public static void main(String[] args) {
        DialogeDemo d1 = new DialogeDemo();
        d1.setSize(500, 500);
        d1.setVisible(true);
        d1.setTitle("Dialog Demo");

        Dialog db = new Dialog(d1,true);
        db.setLayout(new FlowLayout());
        db.add(new Button("YES"));
        db.add(new Button("NO"));
        db.add(new Button("OTHER"));
        db.setSize(300,300);
        db.setVisible(true);


    }
}
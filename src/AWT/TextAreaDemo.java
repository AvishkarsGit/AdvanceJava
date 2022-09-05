package AWT;

import java.awt.*;

public class TextAreaDemo extends Frame {

    TextAreaDemo()
    {
        setLayout(new FlowLayout());
        TextArea ta = new TextArea("Enter Comment Here",40,20,TextArea.SCROLLBARS_VERTICAL_ONLY);
        add(ta);
    }

    public static void main(String[] args) {
        TextAreaDemo ta1 = new TextAreaDemo();
        ta1.setSize(500,500);
        ta1.setVisible(true);
    }
}

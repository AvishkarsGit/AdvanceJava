package Layout_Manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileDialogeDemo extends Frame implements ActionListener {

    Button b1,b2;
    FileDialogeDemo()
    {
        setLayout(new FlowLayout());
        b1=new Button("OPEN");
        b2=new Button("SAVE");

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("OPEN"))
        {
            FileDialog fd = new FileDialog(this,"OPEN", FileDialog.LOAD);
            fd.setVisible(true);
        }
        else
        {
            FileDialog fd1 = new FileDialog(this,"SAVE", FileDialog.SAVE);
            fd1.setVisible(true);
        }
    }
    public static void main(String[] args) {
        FileDialogeDemo f1 = new FileDialogeDemo();
        f1.setSize(500,500);
        f1.setVisible(true);

    }
}

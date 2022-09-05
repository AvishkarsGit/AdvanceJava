package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Example extends Frame implements ActionListener{

    Label result;
    Example(){
        Label title,name,roll,enrollment,sem,marks;

        TextField textName,textRoll,textEnrolment,textMarks;
        Button b1;
        Choice selectSem;

        Color pColor = new Color(171,71,188);
        Color TFColor = new Color(225,190,231);




        b1 = new Button("Register");
        title = new Label("ENTER YOUR INFORMATION");
        name = new Label("Enter Your Name : ");
        roll = new Label("Enter Your Roll Number : ");
        enrollment = new Label("Enter your Enrollment Number : ");
        sem = new Label("Select Your Currant Semester");
        marks = new Label("Enter Your Marks : ");
        result = new Label("												");


        setLayout(null);

        title.setFont(new Font("Arial",Font.BOLD,18));
        title.setBounds(125,50,300,30);
        name.setBounds(50,90,200,30);
        roll.setBounds(50,120,200,30);
        enrollment.setBounds(50,150,200,30);
        sem.setBounds(50,180,200,30);
        marks.setBounds(50,210,200,30);
        b1.setBounds(270,250,70,40);
        result.setBounds(50,260,200,30);

        title.setBackground(pColor);
        name.setBackground(pColor);
        roll.setBackground(pColor);
        enrollment.setBackground(pColor);
        sem.setBackground(pColor);
        marks.setBackground(pColor);
        b1.setBackground(Color.orange);
        result.setBackground(pColor);

        add(name);
        add(title);
        add(roll);
        add(enrollment);
        add(sem);
        add(marks);
        add(b1);
        add(result);
        b1.addActionListener(this);

        selectSem = new Choice();
        selectSem.add("1st Semester");
        selectSem.add("2nd Semester");
        selectSem.add("3rd Semester");
        selectSem.add("4th Semester");
        selectSem.add("5th Semester");
        selectSem.add("6th Semester");
        selectSem.setBounds(250,185,200,30);
        add(selectSem);

//        textName,textRoll,textEnrolment,textMarks;
        textName = new TextField();
        textRoll= new TextField();
        textEnrolment = new TextField();
        textMarks = new TextField();
        textName.setBounds(250,90,200,20);
        textName.setBackground(TFColor);
        add(textName);
        textRoll.setBounds(250,125,200,20);
        textRoll.setBackground(TFColor);
        add(textRoll);
        textEnrolment.setBounds(250,155,200,20);
        textEnrolment.setBackground(TFColor);
        add(textEnrolment);
        textMarks.setBounds(250,215,200,20);
        textMarks.setBackground(TFColor);
        add(textMarks);

        JPanel p = new JPanel();
        p.setBounds(25,40,450,250);
        p.setVisible(true);
        p.setBackground(pColor);
        add(p);

        JPanel p1 = new JPanel();
        p1.setBounds(0,0,500,400);
        Color p1Color = new Color(156,39,176);
        p1.setBackground(p1Color);
        p1.setVisible(true);
        add(p1);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            dispose();
           }
        });

    }

    public static void main(String[] args) {
        Example e = new Example();
        e.setSize(500,400);
        e.setVisible(true);
        e.setTitle("Student Info");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        result.setFont(new Font("Arial", Font.BOLD,15));
        result.setBackground(Color.YELLOW);
        result.setText("Register Successfully...");
    }
}

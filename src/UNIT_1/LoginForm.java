package UNIT_1;

import java.awt.*;

public class LoginForm extends Frame {
    LoginForm()
    {
      label1();
      label2();
      label3();
      TextField();
      TextField1();
      Button();
      Button1();


    }
    public static void main(String[] args) {
        LoginForm lf = new LoginForm();
        lf.setSize(600,600);
        lf.setVisible(true);
        lf.setTitle("Login Form");
        lf.label1();
        lf.label2();
        lf.label3();
        lf.TextField();
        lf.TextField1();
        lf.Button();
        lf.Button1();

    }

    private void label1() {
        setLayout(null);
        setBackground(Color.orange);
        setForeground(Color.BLUE);
        Label label = new Label("     *****  AK SOFT.PVT.LTD *****");
        label.setBackground(Color.WHITE);
        add(label);
        label.setBounds(180,130,285,20);
        label.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,15));
    }
    private void label2(){
        setLayout(null);
        setBackground(Color.orange);
        setForeground(Color.BLUE);
        Label label = new Label("Enter Username:");
        add(label);
        label.setBounds(180,165,135,20);
        label.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,15));
    }
    private void label3(){
        setLayout(null);
        setBackground(Color.orange);
        setForeground(Color.BLUE);
        Label label = new Label("Enter Password:");
        add(label);
        label.setBounds(180,195,135,20);
        label.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,15));
    }
    private void TextField(){
        setLayout(null);
        TextField textField = new TextField(20);
        add(textField);
        textField.setBounds(320,170,145,20);
        textField.setFont(new Font("Times New Roman",Font.CENTER_BASELINE|Font.ITALIC,15));
    }
    private void TextField1(){
        setLayout(null);
        TextField textField = new TextField(20);
        add(textField);
        textField.setEchoChar('*');
        textField.setBounds(320,200,150,20);
        textField.setFont(new Font("Times New Roman",Font.CENTER_BASELINE|Font.ITALIC,15));
    }
    private void Button(){
        setLayout(null);
        Button button = new Button("Login");
        add(button);
        button.setBounds(320,250,100,25);
        button.setBackground(Color.CYAN);
    }
    private void Button1(){
        setLayout(null);
        Button button = new Button("Cancel");
        add(button);
        button.setBounds(180,250,100,25);
        button.setBackground(Color.CYAN);
    }
}
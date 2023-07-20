import javax.swing.*;
import java.awt.event.*;

public class Example1 extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b;
    public Example1(){
        //set frame
        setSize(600, 500);
        setTitle("Odd or Even");

        //for text field
        t1 = new JTextField();
        t1.setBounds(100, 100, 150, 80);
        add(t1);
        t2 = new JTextField();
        t2.setBounds(350, 100, 150, 80);
        add(t2);

        //for button
        b = new JButton("Check");
        b.setBounds(100, 200, 100, 60);
        add(b);

        //set visible
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //for action event
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        if(a%2==0){
            t2.setText("Even Number");
        }
        else{
            t2.setText("Odd Number");
        }
    }
    public static void main(String[]args){
        new Example1();
    }
}

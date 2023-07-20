import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Example1 implements ActionListener{
    JFrame f;
    JButton b1,b2,b3;
    public Example1(){
        f = new JFrame();
        //for frame size
        f.setSize(600,500);
        f.setTitle("Color Change");

        //for buttons
        b1 = new JButton("Red");
        //b1.setBounds(100, 100, 100, 75);
        b2 = new JButton("Blue");
        //b2.setBounds(250, 100, 100, 75);
        b3 = new JButton("Green");
        //b3.setBounds(400, 100, 100, 75);

        //for adding buttons in frame
        f.add(b1);
        f.add(b2);
        f.add(b3);

        //set visible
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //for action event
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        b1.setActionCommand("btn 1");
        b2.setActionCommand("btn 2");
        b3.setActionCommand("btn 3");
    }
    public void actionPerformed(ActionEvent e){
        
        String b = e.getActionCommand();
        if(b.equals("btn 1")){
            f.getContentPane().setBackground(Color.red);
        }
        else if(b.equals("btn 2")){
            f.getContentPane().setBackground(Color.blue);
        }
        else{
            f.getContentPane().setBackground(Color.green);
        }
    }
    public static void main(String []args){
        new Example1();
    }
}

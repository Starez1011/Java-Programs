import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Example implements ActionListener{
    JFrame f1,f2;
    JButton b1,b2;
    JLabel l;
    public Example(){
        b1 = new JButton("Popup");
        b1.setBounds(100,100,150,75);
        f1 = new JFrame();
        f1.setSize(600,500);
        f1.add(b1);
        b1.addActionListener(this);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void menu(){
        l = new JLabel("Hello World");
        b2 = new JButton("OK");
        f2 = new JFrame();
        f2.setSize(200,100);
        f2.setResizable(false);
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        f2.add(l);
        f2.add(b2);
        f2.setLayout(new BoxLayout(f2.getContentPane(),BoxLayout.Y_AXIS));
        f2.setVisible(true);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            this.menu();
        }
        else{
            f2.dispose();
        }
    }
    public static void main(String[]args){
        new Example();
    }
}

import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Guess extends JFrame implements ActionListener{
    JLabel l;
    JTextField t;
    JButton b;
    int attempts,randomNum;

    public Guess(){
        setSize(600,600);
        t=new JTextField();
        t.setColumns(10);
        l=new JLabel();
        b = new JButton("Try");
        add(t);
        add(l);
        add(b);
        generateNumber();
        setLayout(new FlowLayout());
        setVisible(true);
        b.addActionListener(this);
    }
     public void generateNumber(){
        attempts = 0;
        l.setText("Attempts: "+attempts);
        Random r = new Random();
        randomNum = r.nextInt(5);
     }
     public void actionPerformed(ActionEvent e){
        int num = Integer.parseInt(t.getText());
        attempts++;
        if (num==randomNum){
            JOptionPane.showMessageDialog(this,"You have won in "+attempts+" attempts");
            generateNumber();
        }
        else{
            JOptionPane.showMessageDialog(this,"Wrong answer");
            l.setText("Attempts: "+attempts);
        }
     }
     public static void main(String[]args){
        new Guess();
     }
}

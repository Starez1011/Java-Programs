import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Example4 extends JFrame implements ActionListener{
    JButton b1;
    JTextField t1;
    public Example4(){
        setSize(600,500);
        b1 = new JButton("Click");
        b1.setBounds(100,300,100,50);
        t1 = new JTextField("Sample");
        t1.setBounds(100,100,200,50);
        add(b1);add(t1);
        b1.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            Font f = new Font("Arial",Font.BOLD,20);
            t1.setForeground(Color.blue);
            t1.setFont(f);
        }
    }
    public static void main(String[]args){
        new Example4();
    }
}

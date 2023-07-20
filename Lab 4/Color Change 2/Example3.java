import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Example3 extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    public Example3(){
        //for frame size
        setSize(600,500);
        setTitle("Color Change");

        //for buttons
        b1 = new JButton("Red");
        //b1.setBounds(100, 100, 100, 75);
        b2 = new JButton("Blue");
        //b2.setBounds(250, 100, 100, 75);
        b3 = new JButton("Green");
        //b3.setBounds(400, 100, 100, 75);

        //for adding buttons in frame
        add(b1);
        add(b2);
        add(b3);

        //set visible
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //for action event with ANONYMOUS class
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                getContentPane().setBackground(Color.red);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                getContentPane().setBackground(Color.blue);
            }
        });
            b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                getContentPane().setBackground(Color.green);
            }
        });
        
    }
    public static void main(String []args){
        new Example3();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

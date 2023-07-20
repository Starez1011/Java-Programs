import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Example extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,ans;
    public Example(){
        //for frame size
        setSize(600,500);
        setTitle("Add or Sub");
        //for text field
        t1 = new JTextField();
        t1.setColumns(10);
        //t1.setBounds(100,100,175,50);
        add(t1);
        t2 = new JTextField();
        t2.setColumns(10);
        //t2.setBounds(350,100,175,50);
        add(t2);
        ans = new JTextField();
        ans.setColumns(10);
        //ans.setBounds(100,200,175,50);
        ans.setEditable(false);
        add(ans);

        //for buttons
        b1 = new JButton("Add");
        //b1.setBounds(100,350,100,75);
        add(b1);
        b2 = new JButton("Sub");
        //b2.setBounds(200,350,100,75);
        add(b2);

        //for visibility
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //for action event
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int add,sub;
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(e.getSource()==b1){
            add = a+b;
            ans.setText(""+add);
        }
        else{
            sub = a-b;
            ans.setText(""+sub);
        }

    }
    public static void main(String [] args){
        new Example();
    }
}

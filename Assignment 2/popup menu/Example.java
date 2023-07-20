import javax.swing.*;
import java.awt.event.*;

public class Example extends MouseAdapter implements ActionListener{
    JFrame f;
    JLabel l;
    JPopupMenu menu;
    JMenuItem one,two;
    public Example(){
        f = new JFrame();
        f.setSize(600,500);
        l = new JLabel();
        l.setBounds(100,100,200,100);
        f.add(l);
        menu = new JPopupMenu();
        f.add(menu);

        one = new JMenuItem("Sameer");
        two = new JMenuItem("Maharjan");
        menu.add(one);
        menu.add(two);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        one.addActionListener(this);
        two.addActionListener(this);
        f.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        menu.show(f,e.getX(),e.getY());
    }
    public void actionPerformed(ActionEvent e){
        String item = e.getActionCommand();
        l.setText(item+" item is selected");
    }
    public static void main(String[]args){
        new Example();
    }
}

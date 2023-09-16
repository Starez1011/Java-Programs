package Graphics;
import javax.swing.*;
import java.awt.*;

public class Sample extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(100, 100, 400, 400);
        g.setColor(Color.red);
        g.fillOval(150,150,300,300);
        g.setColor(Color.black);
        g.drawString("All the Best",150,150);
    }
    public static void main(String[] ars){
        JFrame f = new JFrame();
        f.setSize(700,700);
        f.setVisible(true);
        f.add(new Sample());
    }
}

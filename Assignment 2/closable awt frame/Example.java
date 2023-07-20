import java.awt.*;
import java.awt.event.*;
public class Example extends WindowAdapter{
    Frame f;
    public Example(){
        f= new Frame();
        f.setSize(600,500);
        f.setVisible(true);
        f.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e){
        f.dispose();
    }
    public static void main(String[]args){
        new Example();
    }
}

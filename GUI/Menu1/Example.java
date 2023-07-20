package Menu1;
import javax.swing.*;
import java.awt.event.*;

class Example extends JFrame implements ActionListener{
    JTextArea t;
    JMenuBar bar;
    JMenuItem n,copy,paste,cut,exit;
    JMenu file,edit;

    public Example(){
        setSize(800,600);
        bar = new JMenuBar();
        setJMenuBar(bar);
        file = new JMenu("File");
        bar.add(file);
        edit = new JMenu("Edit");
        bar.add(edit);

        n = new JMenuItem("Select All");
        file.add(n);
        exit = new JMenuItem("Exit");
        file.add(exit);

        copy = new JMenuItem("Copy");
        edit.add(copy);
        cut = new JMenuItem("Cut");
        edit.add(cut);
        paste = new JMenuItem("Paste");
        edit.add(paste);

        t = new JTextArea();
        t.setBounds(30, 20, 650, 550);
        add(t);
        setLayout(null);
        setVisible(true);

        n.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        cut.addActionListener(this);
        exit.addActionListener(this);
    }
    public void actionPerform(ActionEvent e){
        if(e.getSource() == copy){
            t.copy();
        }
        else if(e.getSource() == cut){
            t.cut();
        }
        else if(e.getSource() == paste){
            t.paste();
        }
        else if(e.getSource() == n){
            t.selectAll();
        }
        else if(e.getSource()==exit){
            System.exit(0);
        }
    }
    public static void main(String[]args){
        new Example();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

    

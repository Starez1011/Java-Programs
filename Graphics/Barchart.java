package Graphics;
import java.awt.*;
import javax.swing.*;
 class Barchart extends JFrame{
    int []data = {35,30,20,25};
    int mwidth = 600;
    int mheight = 600;
    int bar_width = 30;

    public int getMax(){
      int max = 0;
      for(int i:data){
         if(i>max){
            max = i;
         }
      }
      return max;
    }
    public int [] transformData(){
      int [] heights = new int [data.length];

      for(int i=0;i<data.length;i++){
         heights[i] = ((mheight*data[i])/getMax());
      }
      return heights;
    }

    public void paint (Graphics g){
      Color [] colors = {Color.red,Color.black,Color.blue,Color.pink};
      int [] heights = transformData();
      for(int i=0;i<heights.length;i++){
         g.setColor(colors[i]);
         g.fillRect(i*bar_width,mheight-heights[i],bar_width,heights[i]);
      }
    }
    public Barchart(){
      setSize(600,600);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
      new Barchart();
    }
 }
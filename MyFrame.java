import javax.swing.*;
import java.awt.*;

//Example: 
//MyFrame frame = new MyFrame(400, 500, MainPanel, "This is my frame", null);

//Note: if panels and panel are null, it will only add panel to the frame.

public class MyFrame extends JFrame{
  MyFrame(int width, int height, JPanel panel, String name, JPanel[] panels){
    super(name);
    if(panel == null & panels == null){
      System.out.println("Frame must include a panel.");
    }
    if(panel == null){
      for(JPanel single: panels){
        super.add(single);
      }
    }else{
      super.add(panel);
    }
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    super.setSize(width, height);
    super.setVisible(true);
  }
  public static void main(String[] args){}
}

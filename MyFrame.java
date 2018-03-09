import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
  MyFrame(int width, int height, JPanel panel, String name,boolean visible, int exit, JPanel[] panels){
    super(name);
    if(panel == null){
      for(JPanel single: panels){
        super.add(single);
      }
    }else{
      super.add(panel);
    }
    super.setDefaultCloseOperation(exit);
    super.setSize(width, height);
    super.setVisible(visible);
  }
  public static void main(String[] args){}
}

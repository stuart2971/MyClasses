import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyJLabel extends JLabel{
  MyJLabel(String message, Font theFont, int alignment, Color color){
    super(message, alignment);
    super.setFont(theFont);
    super.setForeground(color);
  }
  // public void setText(JLabel label, String text){
  //   label.setText(text);
  // }
  public static void main(String[] args){}
}

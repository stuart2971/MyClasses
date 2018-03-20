import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Example: 
//JLabel label = new MyJLabel("This is a custom label", new Font("Comic Sans MS", Font.PLAIN, 40), 0, Color.blue);
public class MyJLabel extends JLabel{
  MyJLabel(String message, Font theFont, int alignment, Color color){
    super(message, alignment);
    super.setFont(theFont);
    super.setForeground(color);
  }
  public static void main(String[] args){}
}

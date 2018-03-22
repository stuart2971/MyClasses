import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Testing{
  public static void main(String[] args){
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        guiApp();
      }
    });
  }
  static JRadioButton[] radios = {
    new JRadioButton("True"),
    new JRadioButton("False")
  };

  static JComponent[] objects = {
    new JLabel("Hello"),
    new JButton("Hi"),
    new JTextField(),
    radios[0],
    radios[1]
  };
  static MyButtonGroup group = new MyButtonGroup(radios);
  static MyPanel MainPanel = new MyPanel(objects, Color.RED, new GridLayout(4, 1));

  public static void guiApp(){
    MyFrame frame = new MyFrame(600, 400, MainPanel, "This is my frame", null);
  }
}

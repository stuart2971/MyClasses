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

  public static void guiApp(){
    MyFrame frame = new MyFrame(600, 400, MainPanel, "This is my frame", null);
  }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Example: 
// MyJButton button1 = new MyJButton("This is a button");

public class MyJButton extends JButton{
  MyJButton(String text){
    super(text);
    super.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){

      }
    });
  }
}

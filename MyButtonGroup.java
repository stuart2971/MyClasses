import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Example:
// MyButtonGroup group = new MyButtonGroup(radioArray);

//Note: To prevent multiple radio button arrays, a matrix can be used.  :)

public class MyButtonGroup extends ButtonGroup{
  MyButtonGroup(JRadioButton[] radios){
    for(JRadioButton radio: radios){
      super.add(radio);
    }
  }
}

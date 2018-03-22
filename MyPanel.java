import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Example:
//MyPanel MainPanel = new MyPanel(myItems, Color.ORANGE, new GridLayout(4, 2));

public class MyPanel extends JPanel{
  JComponent[] items;
  MyPanel(JComponent[] items){
    super();
    this.items = items;
    addItems();
  }
  MyPanel(JComponent[] items, Color color, GridLayout layout){
    super.setBackground(color);
    if(layout != null){
      super.setLayout(layout);
    }
    this.items = items;
    addItems();
  }
  private void addItems(){
    for(JComponent item : items){
      super.add(item);
    }
  }
}

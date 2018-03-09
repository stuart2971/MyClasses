import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJButton extends JButton{
  MyJButton(String text, String question, int points,int onQuestion){
    super(text);
    super.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        Trivia.checkAnswer.setEnabled(true);
        Trivia.changeQuestion(question, points);
        disableButton();
        Trivia.onQuestion = onQuestion;
      }
    });

    

  }
  public void disableButton(){
    super.setEnabled(false);
  }

}

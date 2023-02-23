package OwlGreeding;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OwlGreeting extends JFrame {
   JLabel labelQuestion;
   JTextField textAnswer;
   public OwlGreeting(){
   setLayout(new FlowLayout());
      labelQuestion = new JLabel("What's your name");
      textAnswer = new JTextField(10);
    add(labelQuestion);
     add(textAnswer);
    }

    public static void main(String args[]){
      OwlGreeting window = new OwlGreeting();
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.setSize(275, 100);
     window.setTitle("Owl Greeting");
      window.setVisible(true);
   }
}
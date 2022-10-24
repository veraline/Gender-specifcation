package Lesson5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonSecond {
    JFrame fm;
    JRadioButton b1,b2;
    JButton btn;
    RadioButtonSecond(){
         fm = new JFrame("Second example for Radio Button");
        b1 = new JRadioButton("Male");
        b2 = new JRadioButton("Female");
        b1.setBounds(30,50, 100,30);
        b2.setBounds(30,85,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        btn = new JButton("Click");
        btn.setBounds(30,150,100,30);



       //btn.addActionListener(this);
        btn.addActionListener(e -> {

            if (b1.isSelected()){
                JOptionPane.showMessageDialog(btn,"You are a Male");
            }

            if (b2.isSelected()){
                JOptionPane.showMessageDialog(btn, "You are a Female");
            }
            System.out.println("Clicked");
        });
        fm.add(b1);
        fm.add(b2);
        fm.add(btn);

        fm.setSize(400,400);
        fm.setLayout(null);
        fm.setVisible(true);

    }


//    public void actionPerformed(ActionEvent e) {
//       if(b1.isSelected()){
//            JOptionPane.showMessageDialog(this, "You are a male");
//        }
//        if(b2.isSelected()){
//            JOptionPane.showMessageDialog(this,"You are a Female");
//        }
   //}
    public static void main(String [] args){
        new RadioButtonSecond();
    }
}

package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel{
    static int counter=0;
    public Panel(){
        Font font = new Font("Arrial", Font.BOLD, 20);

        JButton myButton=new JButton("Simple Button");
        myButton.setFont(font);
        setLayout(new FlowLayout());
        add(myButton, BorderLayout.NORTH);

     /*   JButton myButton2=new JButton("0");
        myButton2.setFont(font);
        add(myButton2, BorderLayout.SOUTH);*/

        myButton.setText("I'm not clicked");
        //   ButtonAction buttonAction=new ButtonAction(myButton);
        //   myButton.addActionListener(buttonAction);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                //myButton.setText("I'm clicked!");
               // myButton.setText(String.valueOf(counter));
                myButton.setText(generateTelephoneNumber());
            }
        });
    }
    public String generateTelephoneNumber(){
        String telephoneNumber="";
        telephoneNumber+="+7";
        telephoneNumber+="(999)";
        Random random=new Random();
        telephoneNumber+=random.nextInt(10);
        telephoneNumber+=random.nextInt(10);
        telephoneNumber+=random.nextInt(10);
        telephoneNumber+=random.nextInt(10);
        telephoneNumber+=random.nextInt(10);
        telephoneNumber+=random.nextInt(10);
        telephoneNumber+=random.nextInt(10);
        return telephoneNumber;
    }
}

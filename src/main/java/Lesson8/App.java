package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame{

    public App() {

        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        //zdes bil kusok koda kotorii perekocheval v klass Panel

        add(new Panel(), BorderLayout.NORTH);
        add(new Panel(), BorderLayout.SOUTH);

        setVisible(true);

    }

    public static void main(String[] args) {

        App app=new App();
    }

}

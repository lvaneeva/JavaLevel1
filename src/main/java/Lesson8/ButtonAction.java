package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
    private JButton button;
    public void actionPerformed(ActionEvent a) {
        button.setText("I'm clicked");

    }

    public ButtonAction(JButton button) {
        this.button = button;
    }
}

package Chapter15.buttonexample;

import javax.swing.*;
import java.awt.*;

public class ButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");

        // Add buttons to the panel
        panel.add(button);
        panel.add(buttonTwo);


        frame.getContentPane().add(BorderLayout.CENTER, panel);


        frame.setVisible(true);
    }
}

package com.assignment;

import javax.swing.*;
import java.awt.event.*;

// Swing GUI class
public class Assignment3Swing {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Simple Form");

        // Components
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Submit");
        JLabel result = new JLabel("");

        // Set positions (x, y, width, height)
        label.setBounds(50, 50, 100, 30);
        textField.setBounds(150, 50, 150, 30);
        button.setBounds(120, 100, 100, 30);
        result.setBounds(100, 150, 200, 30);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                result.setText("Hello " + name);
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

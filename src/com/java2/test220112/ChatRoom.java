package com.java2.test220112;

import javax.swing.*;
import java.awt.*;

public class ChatRoom extends JFrame {
        JTextField textField;
        JTextArea textArea;

        public ChatRoom() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            textArea = new JTextArea(20,10);
            textField = new JTextField(20);

            JScrollPane scrollPane = new JScrollPane(textArea,
                    ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            this.add(scrollPane, BorderLayout.CENTER);
            this.add(textField,BorderLayout.SOUTH);
            this.pack();
            this.setVisible(true);
        }
    public static void main(String[] args) {
            new ChatRoom();
    }
}

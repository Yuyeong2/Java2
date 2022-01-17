package com.java2.test220112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {
    JTextField idTextField;
    JTextField pwTextField;
    JButton loginButton;
    JButton signInButton;

    public LoginGUI() {

        setTitle("Login 화면");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (screenSize.width / 2.5), (int) (screenSize.height / 2.5), 400, 200);

        JPanel mainWindowPanel = new JPanel();
        mainWindowPanel.setLayout(new GridLayout(0, 1));

        JPanel loginWindowPanel = new JPanel();
        JLabel loginLabel = new JLabel("ID: ");
        idTextField = new JTextField(10);

        loginWindowPanel.add(loginLabel);
        loginWindowPanel.add(idTextField);

        JPanel pwWindowPanel = new JPanel();
        JLabel pwLabel = new JLabel("PW: ");
        pwTextField = new JTextField(10);

        loginWindowPanel.add(pwLabel);
        loginWindowPanel.add(pwTextField);

        JPanel loginButtonPanel = new JPanel();

        loginButton = new JButton("로그인");
        loginButton.setSize(400, 20);
        loginButton.addActionListener(this);

        signInButton = new JButton("회원가입");
        signInButton.setSize(400, 20);
        signInButton.addActionListener(this);

        loginButtonPanel.add(loginButton);
        loginButtonPanel.add(signInButton);

        mainWindowPanel.add(loginWindowPanel);
        mainWindowPanel.add(pwWindowPanel);
        mainWindowPanel.add(loginButtonPanel);

        this.add(mainWindowPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        LoginGUI test = new LoginGUI();
    }

}

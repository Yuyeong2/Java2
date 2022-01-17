package com.java2.test220112;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

class MultiThread extends JPanel implements ActionListener{
    private JProgressBar progressBar1, progressBar2;
    private JButton starButton;

    public MultiThread() {
        starButton = new JButton("Start");
        starButton.addActionListener(this);
        progressBar1 = new JProgressBar(0, 1000);
        progressBar2 = new JProgressBar(0, 1000);

        progressBar1.setValue(0);
        progressBar1.setStringPainted(true);
        progressBar2.setValue(0);
        progressBar2.setStringPainted(true);

        this.add(starButton);
        this.add(progressBar1);
        this.add(progressBar2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        starButton.setEnabled(false);
        ProgressClass p1 = new ProgressClass(progressBar1, starButton);
        ProgressClass p2 = new ProgressClass(progressBar2, starButton);
        p1.start();
        p2.start();
    }
}

class ProgressClass extends Thread {
    private JProgressBar jpb;
    private JButton jButton;

    public ProgressClass(JProgressBar jpb, JButton jButton) {
        this.jpb = jpb;
        this.jButton = jButton;
    }

    @Override
    public void run() {
        int current = 0;
        while(current <= 1000) {
            current += Math.random() * 10;
            jpb.setValue(current);
            try {
                sleep(10);
            } catch (Exception e) {
            }
        }
        jButton.setEnabled(true);
    }
}

public class Test220117 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.add(new MultiThread());
        frame.setVisible(true);
    }
}
package com.java2.test220112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/*class Solution {
    public String solution(int a, int b) {
        a = Integer.parseInt(String.format("%02d", a));
        b = Integer.parseInt(String.format("%02d", b));
        LocalDate date = LocalDate.of(2016, a, b);
        String weekday = date.getDayOfWeek().toString();
        String answer = weekday.substring(0,3);
        return answer;
    }
}*/
//---------------------------------------------------------------------//


public class Test220112 extends JFrame {
    class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            button.setText("버튼이 눌렸습니다.");
            System.out.println("이벤트 발생!");
        }
    }

    public Test220112() {
        setTitle("Java Program");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image image = kit.getImage(".\\JAVAGUI\\icon.png");
        setIconImage(image);

        JPanel panel = new JPanel();

        JButton button = new JButton("버튼이 클릭되지 않았습니다.");
        button.setText("텍스트 변경");
        button.addActionListener(new MyListener());

        JLabel label = new JLabel("버튼이 클릭되지 않았습니다.");

        panel.add(button);
        add(panel);

/*        setLayout(new GridLayout(0, 2, 2, 2));
        JButton b1 = new JButton("t1");
        JButton b2 = new JButton("t2");
        JButton b3 = new JButton("t3");
        JButton b4 = new JButton("t4");
        add(b1); add(b2); add(b3); add(b4);*/

/*        JPanel panel_Parent = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        JLabel label1 = new JLabel("프로그래밍의 세계에 오신 것을 환영합니다.");
        panelA.add(label1);

        JButton button1 = new JButton("JAVA");
        JButton button2 = new JButton("PYTHON");
        JButton button3 = new JButton("JAVA SCRIPT");

        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);

        JLabel label2 = new JLabel("개수");
        JTextField textField = new JTextField(10);

        panelB.add(label2);
        panelB.add(textField);

        panel_Parent.add(panelA);
        panel_Parent.add(panelB);
        add(panel_Parent);*/

/*        setLayout(new FlowLayout());
        JButton button = new JButton("이건 버튼");
        JButton button2 = new JButton();
        button2.setText("이것도 버튼");

        add(button);
        add(button2);*/


        setVisible(true);
    }

    public static void main(String[] args) {
        Test220112 t = new Test220112();


//---------------------------------------------------------------------//

/*        Solution solution = new Solution();
        System.out.println(solution.solution(1, 7));*/

//---------------------------------------------------------------------//

/*        LocalDate date = LocalDate.of(2016,04,10);
        LocalTime time = LocalTime.of(12,30,14);
        String a = date.getDayOfWeek().toString();
        System.out.println(a);
        System.out.println(time);*/

//---------------------------------------------------------------------//


/*      long start = System.currentTimeMillis();

      for (int i = 0; i <100000; i++) {
          System.out.println(i);
      }
      long end = System.currentTimeMillis();
        System.out.println(end - start);*/

//---------------------------------------------------------------------//

/*        Test220112 cl = new Test220112();
        try {
            cl.methodA();
        } catch (Exception e) {

        }*/

//---------------------------------------------------------------------//
/*        try {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("숫자 입력 완료");

            int result = a / b;
            System.out.println("result : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

        } finally {
            System.out.println("프로그램 끝");
        }*/
    }
}

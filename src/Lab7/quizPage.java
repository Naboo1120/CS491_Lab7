package Lab7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quizPage extends JFrame {
    private JPanel MainPanel;
    private JPanel Question1;
    private JPanel Question2;
    private JPanel Question3;
    private JPanel Question4;
    private JPanel Question5;
    private JTextField textField2;
    private JLabel T2;
    private JLabel Q2;
    private JTextField textField3;
    private JLabel T3;
    private JLabel Q3;
    private JTextField textField4;
    private JLabel T4;
    private JLabel Q4;
    private JTextField textField5;
    private JLabel T5;
    private JButton submit1;
    private JButton submit2;
    private JButton submit3;
    private JButton submit4;
    private JLabel Q5;
    private JButton submit5;
    private JTextField textField1;
    private JLabel Q1;
    private JLabel T1;
    private JButton next1;
    private JButton next2;
    private JButton next3;
    private JButton next4;
    private JButton next5;

    public quizPage() {

        this.setContentPane(MainPanel);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        submit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        submit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        submit3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        submit4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        submit5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}

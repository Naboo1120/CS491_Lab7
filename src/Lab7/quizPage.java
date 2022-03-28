package Lab7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class quizPage extends JFrame{
    private JPanel quizPagePanel;
    private JLabel Q1;
    private JLabel Q2;
    private JLabel Q3;
    private JLabel Q4;
    private JLabel Q5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel q1Panel;
    private JPanel q2Panel;
    private JPanel q3Panel;
    private JPanel q4Panel;
    private JPanel q5Panel;
    private JButton Q1Button;
    private JButton Q2Button;
    private JButton Q3Button;
    private JButton Q4Button;
    private JButton Q5Button;

    public quizPage() {
    JFrame frame = new JFrame("Quiz Page");
    frame.setContentPane(quizPagePanel);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);


    q2Panel.setVisible(false);
    q3Panel.setVisible(false);
    q4Panel.setVisible(false);
    q5Panel.setVisible(false);

    Q1.setText(Quiz.calc());

        Q1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q1Panel.setVisible(false);
                q2Panel.setVisible(true);
                Q2.setText(Quiz.calc());
            }
        });

        Q2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q2Panel.setVisible(false);
                q3Panel.setVisible(true);
                Q3.setText(Quiz.calc());
            }
        });

        Q3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q3Panel.setVisible(false);
                q4Panel.setVisible(true);
                Q4.setText(Quiz.calc());
            }
        });

        Q4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q4Panel.setVisible(false);
                q5Panel.setVisible(true);
                Q5.setText(Quiz.calc());
            }
        });

        Q5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q5Panel.setVisible(false);
                resultPage rp = new resultPage();

                dispose();
            }
        });
    }



}

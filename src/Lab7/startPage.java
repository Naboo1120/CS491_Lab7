package Lab7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startPage extends JFrame{
    private JLabel mathQuizLabel;
    private JButton startQuizButton;
    private JLabel description;
    private JLabel GL;
    private JPanel field;


    public startPage() {
        startQuizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               quizPage quizPage = new quizPage();
               quizPage.setContentPane(Lab7.quizPage);
               quizPage.setVisible(true);
            }
        });
    }

    public static void main(String args[]){
            JFrame frame = new JFrame("Start Page");
            frame.setContentPane(new startPage().field);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);


        }
}

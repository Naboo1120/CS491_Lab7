package Lab7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startPage extends JFrame {
    private JLabel mathQuizLabel;
    private JButton startQuizButton;
    private JLabel description;
    private JLabel GL;
    private JPanel field;


    public startPage(){

    this.setContentPane(field);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();


    startQuizButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            quizPage qP = new quizPage();
            dispose();
        }
    });
}



    public static void main(String args[]){

        JFrame frame = new startPage();
        frame.setVisible(true);

        }

}

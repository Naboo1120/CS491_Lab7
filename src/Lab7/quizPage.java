package Lab7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quizPage extends JFrame{
    private JPanel quizPagePanel;
    private JLabel Hello;

public quizPage() {
    JFrame frame = new JFrame("Quiz Page");
    frame.setContentPane(quizPagePanel);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}

    public static void main(String[] args) {

    }


}

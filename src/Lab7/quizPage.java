package Lab7;

import javax.swing.*;

public class quizPage extends JFrame{
    private JPanel quizPagePanel;
    private JLabel Hello;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab7.Quiz Page");
        frame.setContentPane(new quizPage().quizPagePanel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

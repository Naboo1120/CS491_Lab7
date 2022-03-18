import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startPage extends JFrame {
    private JPanel field;
    private JLabel mathQuizLabel;
    private JButton startQuizButton;
    private JLabel description;
    private JLabel GL;

    public startPage(String start_page) {
        startQuizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


        public static void main(String args[]){
            JFrame frame = new startPage("Start Page");
            frame.setVisible(true);


        }
}

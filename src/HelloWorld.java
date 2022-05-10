import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JPanel Main;
    private JTextArea display;
    private JButton clickHereButton;
    private JButton clearButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public HelloWorld() {
        clickHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.append(String.valueOf("Welcome To My Project\n"));
                display.append(String.valueOf("Thank you for Visiting us"));
                display.append(String.valueOf("Have a good Day..."));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText("");
            }
        });
    }
}

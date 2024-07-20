import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        setTitle("Car rental");

        JPanel mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setBackground(Color.orange);

        JPanel buttonPanel = new JPanel();

        JButton bttn1 = new JButton();
        JButton bttn2 = new JButton();

        buttonPanel.add(bttn1);
        buttonPanel.add(bttn2);

        mainPanel.add(buttonPanel);
        mainPanel.setLayout(new GridLayout(2,2));

        setVisible(true);
        setResizable(false);
        setSize(800,700);
    }

}
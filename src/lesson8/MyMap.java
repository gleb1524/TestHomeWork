package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMap extends JFrame {

    public MyMap(){

        setBounds(300, 200, 400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MyMap");
        setResizable(false);

        JLabel textField = new JLabel("Выберите действие");
        Font font = new Font("Arial", Font.BOLD, 14);
        textField.setFont(font);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setEnabled(false);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(1, 3));
        add(panel);

        JButton button = new JButton("GuessGame");
        JButton button1 = new JButton();
        JButton button2 = new JButton("Game2");
        panel.setFont(font);
        panel.add(button);
        panel.add(button1);
        button1.setVisible(false);
        panel.add(button2);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuessGame guessGame = new GuessGame();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game2 game2 = new Game2();
            }
        });

        setVisible(true);

    }

}

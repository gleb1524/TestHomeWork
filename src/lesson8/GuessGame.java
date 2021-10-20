package lesson8;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame extends JFrame {
    private int var = (int)(Math.random()*10+1);
    private JTextField textField;
    private int count = 0;
    public GuessGame() {

        setBounds(300, 200, 600, 120);
        setTitle("GuessGame");
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 14);
        textField = new JTextField("Какое число загадал компьютер?У вас 3 попытки.");
        textField.setFont(font);
        textField.setBackground(Color.black);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setEnabled(false);
        add(textField, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            buttonsPanel.add(button);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(finalI, button);
                }
            });
        }
        JButton button = new JButton("press res");
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                GuessGame game = new GuessGame();
            }
        });


        setVisible(true);

    }
        public void tryToAnswer ( int variable, JButton button){
        if(count==5) return;
        count++;
           if(count<=3){
            if (variable == var) {
                textField.setText("Угадали!Ответ " + variable);
                textField.setBackground(Color.white);
                button.setBackground(Color.green);
                count=5;
                return;
            }else if(variable>var){
                textField.setText("Не верно! Загаданое число меньше.Попыток осталось "+(3-count));
            }else if(variable<var){
                textField.setText("Не верно!Загаданое число больше!Попыток осталось "+(3-count));
            }
           }
            if(count>=3){
                textField.setText("Вы проиграли!Загаданое число "+var);
                textField.setBackground(Color.red);
                button.removeActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        return;
                    }
                });
                return;
            }
        }

}

package lesson8;

import javax.swing.*;
import java.awt.*;

public class Game2 extends JFrame {
    public Game2(){
        setBounds(300, 300, 600, 100);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Game2");
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        TextField text = new TextField("ИГРА В РАЗРАБОТКЕ");
        text.setEnabled(false);
        panel.add(text, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);

        setVisible(true);

    }
}

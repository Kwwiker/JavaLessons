package lesson3;

import javax.swing.*;

public class FootballGameTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FootballGame();
            }
        });
    }
}

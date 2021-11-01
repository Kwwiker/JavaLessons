package lesson3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballGame {
    private int team1 = 0, team2 = 0;
    private String lastScorer="N/A", winner="DRAW";
    private JButton jb1, jb2;
    private JLabel resultLabel, lastScorerLabel, winnerLabel;

    FootballGame() {
        JFrame mainFrame = new JFrame("Football");
        mainFrame.setSize(new Dimension(400, 100));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        JLabel jLabel = new JLabel("Let's go!");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        jb1 = new JButton("AC Milan");
        jb1.setBounds(0,0,150,152);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                change(jb1);
            }
        });
        jb2 = new JButton("Real Madrid");
        jb2.setBounds(0,0,150,152);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                change(jb2);
            }
        });

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        resultLabel = new JLabel();
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel();
        upd();

        panel1.add(resultLabel);
        panel1.add(lastScorerLabel);
        panel1.add(winnerLabel);

        panel.add(jb1, BorderLayout.WEST);
        panel.add(panel1, BorderLayout.CENTER);
        panel.add(jb2, BorderLayout.EAST);

        mainFrame.setContentPane(panel);
        mainFrame.setVisible(true);
    }

    void change(JButton button) {
        if (button.getText().equals("AC Milan")) {
            team1+=1;
        }
        if (button.getText().equals("Real Madrid")) {
            team2 +=1;
        }
        lastScorer = button.getText();
        if (team1 > team2) {
            winner = "AC Milan";
        } else if (team2 > team1) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW";
        }
        upd();
    }

    void upd() {
        resultLabel.setText("Result: "+team1+" X "+ team2);
        lastScorerLabel.setText("Last Scorer: "+lastScorer);
        winnerLabel.setText("Winner: "+winner);
    }
}

package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Yahtzee extends JFrame {
    private boolean playGame;
    private JPanel gamePanel;

    public Yahtzee() {
        this.playGame = true;
        this.initFrame();
    }

    private void initFrame() {
        this.setTitle("Yahtzee!");
        this.setBounds(50, 50, 1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(java.awt.Color.BLACK);
        this.setVisible(true);
    }
}
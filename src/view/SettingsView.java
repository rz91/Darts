package view;

import controller.SettingsViewController;

import javax.swing.*;
import java.awt.*;


public class SettingsView extends JFrame{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private SettingsViewController c;
    private JButton startGameButton;
    private JPanel panel1;

    public SettingsView(){

        c = new SettingsViewController(this);
        this.initialise();
    }

    private void initialise(){

        panel1.setBackground(Color.WHITE);
        startGameButton.addActionListener(c);

        this.setSize(300,300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

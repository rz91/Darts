package view;

import controller.SettingsViewController;
import model.Model;

import javax.swing.*;
import java.awt.*;


public class SettingsView extends JFrame{
    private JComboBox player;
    private JComboBox game;
    private SettingsViewController c;
    private JButton startGameButton;
    private JPanel panel1;
    private Model m;

    public SettingsView(){

        this.m = new Model();
        this.c = new SettingsViewController(this,m);
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

    public int getNumberOfPlayers(){
        return this.player.getSelectedIndex() + 1;
    }

    public int getGame(){

        return Integer.parseInt((String) this.game.getSelectedItem());
    }
}

package view;

import controller.SettingsViewController;
import model.X01Model;

import javax.swing.*;
import java.awt.*;


public class SettingsView extends JFrame{
    private JComboBox player;
    private JComboBox game;
    private SettingsViewController c;
    private JButton startGameButton;
    private JPanel panel1;
    private JComboBox gamechooser;
    private X01Model m;

    public SettingsView(){

        this.c = new SettingsViewController(this);
        this.initialise();
    }

    private void initialise(){

        panel1.setBackground(Color.WHITE);
        game.setEnabled(false);
        startGameButton.addActionListener(c);
        startGameButton.setActionCommand("s");
        gamechooser.addActionListener(c);
        gamechooser.setActionCommand("c");

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

    public String getChoose() {
        return String.valueOf(gamechooser.getSelectedItem());
    }

    public void setDisabled() {
        game.setEnabled(false);
    }
    public void setEnabled() {
        game.setEnabled(true);
    }
}

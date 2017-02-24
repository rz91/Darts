package controller;

import model.Model;
import view.MainWindow;
import view.SettingsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsViewController implements ActionListener {
    private Model m;
    private SettingsView sd;

    public SettingsViewController(SettingsView sd, Model m){

        this.sd = sd;
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.m.setNumber_of_players(sd.getNumberOfPlayers());
        this.m.setGame(sd.getGame());
        new MainWindow(m);
        sd.dispose();
    }
}

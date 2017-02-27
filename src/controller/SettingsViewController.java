package controller;

import model.Model;
import view.MainView;
import view.SettingsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsViewController implements ActionListener {
    private Model m;
    private SettingsView sd;

    public SettingsViewController(SettingsView sd){

        this.sd = sd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.m = new Model(sd.getGame(),sd.getNumberOfPlayers());
        new MainView(m);
        sd.dispose();
    }
}

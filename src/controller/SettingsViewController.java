package controller;

import view.MainWindow;
import view.SettingsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsViewController implements ActionListener {

    private SettingsView sd;

    public SettingsViewController(SettingsView sd){

        this.sd = sd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        new MainWindow();
        sd.dispose();
    }
}

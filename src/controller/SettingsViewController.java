package controller;

import model.CricketModel;
import model.X01Model;
import view.CricketView;
import view.X01View;
import view.SettingsView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsViewController implements ActionListener {
    private X01Model m;
    private SettingsView sd;

    public SettingsViewController(SettingsView sd){

        this.sd = sd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "s":
                if(sd.getChoose() == "Cricket"){
                    new CricketView(sd.getNumberOfPlayers());
                } else {
                    this.m = new X01Model(sd.getGame(),sd.getNumberOfPlayers());
                    new X01View(m);
                }

                sd.dispose();
                break;

            case "c":
                if(sd.getChoose() == "Cricket"){
                    sd.setDisabled();
                } else {
                    sd.setEnabled();
                }
                break;
        }
    }
}

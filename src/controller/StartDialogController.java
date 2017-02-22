package controller;

import view.MainView;
import view.StartDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartDialogController implements ActionListener {

    private StartDialog sd;

    public StartDialogController (){

        this.sd = new StartDialog(this);
        sd.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        new MainView();
        sd.dispose();
    }
}

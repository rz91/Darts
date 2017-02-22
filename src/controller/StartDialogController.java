package controller;

import view.MainWindow;
import view.StartDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartDialogController implements ActionListener {

    private StartDialog sd;

    public StartDialogController (StartDialog sd){

        this.sd = sd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        new MainWindow();
        sd.dispose();
    }
}

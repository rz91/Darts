package controller;

import view.MainView;
import view.StartDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartDialogController implements ActionListener {

    private StartDialog sd;

    public StartDialogController (StartDialog sd){
        this.sd = sd;
        sd.startGameButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        MainView gv = new MainView();
        sd.dispose();
    }
}

package components;

import model.CricketModel;

import javax.swing.*;
import java.awt.*;


public class CricketPanel extends JPanel {
    CricketModel m;

    public CricketPanel(CricketModel m){
        this.m = m;
        setVisible(true);
        buildCricketPanel();
    }

    private void buildCricketPanel(){

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        for(int i = 0; i < m.getNumberOfPlayers(); i++){
            JTextField playerfield = new JTextField("Player" + (i + 1));
            c.gridx = i + 1;
            c.gridy = 0;
            add(playerfield,c);
        }



    }
}

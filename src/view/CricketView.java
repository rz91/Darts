package view;

import components.CricketPanel;
import model.CricketModel;

import javax.swing.*;
import java.awt.*;

public class CricketView extends View {
    private CricketModel m;

    public CricketView(CricketModel m){

        this.m = m;
        this.initialise();


    }

    public void initialise(){

        this.setContentPane(new CricketPanel(m));
        //this.getContentPane().setBackground(new Color(60, 63, 65));
        this.setSize(500,500);
        this.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

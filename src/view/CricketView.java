package view;

import components.CricketPanel;
import model.CricketModel;

import javax.swing.*;
import java.awt.*;

public class CricketView extends View {
    private int number_of_players;

    public CricketView(int number_of_players){

        this.number_of_players = number_of_players;
        this.initialise();


    }

    public void initialise(){
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setContentPane(new CricketPanel(number_of_players));
        //this.getContentPane().setBackground(new Color(60, 63, 65));
        this.pack();
        this.setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

package view;

import model.Model;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class PlayerPanel extends JPanel implements Observer{
    private Model m;
    private JPanel panel1;
    private JTextField playername;
    private JLabel score;
    private JLabel out;

    public PlayerPanel(Model m){

        this.m = m;
        this.m.addObserver(this);
        this.add(panel1);
    }

    @Override
    public void update(Observable o, Object arg) {

        if(m == o){
            this.score.setText(String.valueOf(m.getScore()));
        }

    }
}

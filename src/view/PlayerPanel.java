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
    private int number = 0;

    public PlayerPanel(Model m, int number){

        this.m = m;
        this.m.addObserver(this);
        this.number = number;
        this.add(panel1);
        this.setPlayername();
        this.score.setText(String.valueOf(m.getGame()));
    }

    @Override
    public void update(Observable o, Object arg) {

        if(m == o && number == (Integer) arg){
            this.score.setText(String.valueOf(m.getScore()));
        }

    }

    public void setPlayername(){
        this.playername.setText("Player " + number);
    }
}

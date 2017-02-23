package view;

import controller.GameViewController;
import model.Model;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class GameView extends JPanel implements Observer{
    private Model m;
    private GameViewController c;
    private JLabel hallo;

    public GameView(Model m){

        this.m = m;
        this.m.addObserver(this);
        this.c = new GameViewController(this);

        this.hallo = new JLabel("HAllo");
        this.add(hallo);
    }

    @Override
    public void update(Observable o, Object arg) {

        if(m == o){
            hallo.setText(String.valueOf(m.getScore()));
        }

    }
}

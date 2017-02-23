package view;

import controller.GameViewController;
import model.Model;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{
    private Model m;
    private GameViewController c;
    private PlayerPanel pp;
    private PlayerPanel ee;
    private PlayerPanel ff;
    private PlayerPanel gg;
    private PlayerPanel ii;
    private PlayerPanel jj;

    public GameView(Model m){

        this.m = m;
        this.c = new GameViewController(this);
        this.initialise();

    }

    private void initialise(){

        this.setLayout(new GridLayout(3,2,50,50));
        this.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

        this.pp = new PlayerPanel(m);
        this.ee = new PlayerPanel(m);
        this.ff = new PlayerPanel(m);
        this.gg = new PlayerPanel(m);
        this.ii = new PlayerPanel(m);
        this.jj = new PlayerPanel(m);
        this.add(pp);
        this.add(ee);
        this.add(ff);
        this.add(gg);



    }


}

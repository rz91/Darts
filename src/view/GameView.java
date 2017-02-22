package view;

import javax.swing.*;


public class GameView extends JFrame {

   public GameView(){

        DartView dv = new DartView();
        add(dv);
        setResizable(false);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

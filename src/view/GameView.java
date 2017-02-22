package view;

import controller.GameViewController;
import javax.swing.*;

public class GameView extends JPanel {
    GameViewController c;

    public GameView(){

        this.c = new GameViewController(this);

        JLabel hallo = new JLabel("HAllo");
        this.add(hallo);
    }
}

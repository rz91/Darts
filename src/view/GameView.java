package view;


import controller.GameViewController;

import javax.swing.*;

public class GameView extends JPanel {

    public GameView(GameViewController c){
        JLabel hallo = new JLabel("HAllo");
        add(hallo);
    }
}

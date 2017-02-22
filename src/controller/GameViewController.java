package controller;

import view.GameView;

public class GameViewController {

    private GameView gv;

    public GameViewController(){

        gv = new GameView(this);
        gv.setVisible(true);

    }

    public GameView getGv() {
        return gv;
    }
}

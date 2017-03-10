package components;

import model.X01Model;
import model.Player;
import observer.PlayerObserver;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements PlayerObserver {
    private X01Model m;
    private PlayerPanel[] playerpanels;


    public GamePanel(X01Model m){

        this.m = m;
        this.initialise();
        this.m.registerPlayerObserver(this);

    }

    private void initialise(){

        this.setLayout(new GridLayout(3,2,50,50));
        //this.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        this.generatePlayerPanels();

    }

    private void generatePlayerPanels() {

        playerpanels = new PlayerPanel[m.getNumberOfPlayers()];

        for (int i = 0; i < playerpanels.length; i++){
            playerpanels[i] = new PlayerPanel(m.getGame(),i + 1);
            playerpanels[i].undoHighlighting();
            this.add(playerpanels[i]);
        }

        playerpanels[0].setHighlighted();

    }


    @Override
    public void updatePlayerData(Player actual_player,int hit_counter) {

        playerpanels[actual_player.getId()].setScore(actual_player.getScore());
        playerpanels[actual_player.getId()].setOut(actual_player.getOut());
        playerpanels[actual_player.getId()].setHit(hit_counter);

        if (actual_player.getScore() == 0){
            new NewGameDialog(m);
        }

    }

    public void updatePlayerPanel(int act, int prev){
        playerpanels[act].setHighlighted();
        playerpanels[prev].undoHighlighting();

    }
}

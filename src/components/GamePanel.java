package components;

import model.Model;
import model.Player;
import observer.PlayerObserver;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements PlayerObserver {
    private Model m;
    private PlayerPanel[] playerpanels;


    public GamePanel(Model m){

        this.m = m;
        this.initialise();
        this.m.registerPlayerObserver(this);

    }

    private void initialise(){

        this.setLayout(new GridLayout(3,2,50,50));
        this.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        this.generatePlayerPanels();

    }

    private void generatePlayerPanels() {

        playerpanels = new PlayerPanel[m.getNumberofPlayers()];

        for (int i = 0; i < playerpanels.length; i++){
            playerpanels[i] = new PlayerPanel(m.getGame());
            this.add(playerpanels[i]);
        }

        playerpanels[0].setBackground(Color.orange);
    }


    @Override
    public void updatePlayerData(Player actual_player) {

        playerpanels[actual_player.getId()].setScore(actual_player.getScore());

    }

    public void updatePlayerPanel(int act, int prev){

        playerpanels[act].setBackground(Color.orange);
        playerpanels[prev].setBackground(Color.WHITE);

    }
}

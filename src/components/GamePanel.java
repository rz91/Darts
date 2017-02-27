package components;

import model.Model;
import model.Player;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {
    private Model m;
    private PlayerPanel[] playerpanels;


    public GamePanel(Model m){

        this.m = m;
        this.initialise();
        this.m.addObserver(this);

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
    }


    @Override
    public void update(Observable o, Object arg) {


        Player actual_player = (Player) arg;

        playerpanels[actual_player.getId()].setScore(actual_player.getScore());
    }
}

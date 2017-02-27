package components;

import model.Model;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{
    private Model m;


    public GamePanel(Model m){

        this.m = m;
        this.initialise();

    }

    private void initialise(){

        this.setLayout(new GridLayout(3,2,50,50));
        this.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        this.generatePlayerPanels();

    }

    private void generatePlayerPanels(){

        for (int i = 1; i <= m.getNumber_of_players() ; i++){
            add(new PlayerPanel(m,i));
        }
    }


}

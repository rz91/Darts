package model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;

public class Model extends Observable {
    private int score = 0;
    BufferedImage help_board;

    public void score(int hit_x, int hit_y){

        try{
            help_board = ImageIO.read(new File("images/Dartboard_black.png"));
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }

        this.setScore(new Color(help_board.getRGB(hit_x,hit_y)).getRed());

        setChanged();
        notifyObservers();

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

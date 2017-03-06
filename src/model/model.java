package model;

import iterator.PlayerIterator;
import observer.PlayerSubject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Model extends PlayerSubject {
    BufferedImage help_board;
    private int numberOfPlayers;
    private int game;
    private Player[] players;
    private PlayerIterator pi;
    private Player actual_player;
    private int actual_score;
    private Player previous_player;
    private int hit_counter = 0;

    public Model (int game, int numberOfPlayers){

        this.numberOfPlayers = numberOfPlayers;
        this.game = game;

        initialiseHelpBoard();
        initialisePlayer();
    }

    public void initialiseHelpBoard(){

        try{
            help_board = ImageIO.read(new File("images/Dartboard_black.png"));
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }

    public void initialisePlayer(){

        players = new Player[this.numberOfPlayers];

        for(int i = 0; i < players.length; i++){
            players[i] = new Player(this.game,i);
        }

        pi = new PlayerIterator(players);
        actual_player = pi.next();
        previous_player = pi.getPrev();

    }

    public void calculateScore (int x , int y){
        int hit = new Color(help_board.getRGB(x,y)).getRed();
        hit_counter++;

        switch (hit_counter) {
            case 1:
                actual_score = actual_player.getScore();
                actual_player.decreaseScore(hit);

                if(actual_player.getScore() < 0){
                    actual_player.setScore(actual_score);
                    notifyPlayerObservers(actual_player);
                    hit_counter = 0;
                    changePlayer();
                } else {
                    notifyPlayerObservers(actual_player);
                }

                break;
            case 2:
                actual_player.decreaseScore(hit);

                if(actual_player.getScore() < 0){
                    actual_player.setScore(actual_score);
                    notifyPlayerObservers(actual_player);
                    hit_counter = 0;
                    changePlayer();
                } else {
                    notifyPlayerObservers(actual_player);
                }

                break;
            case 3:
                actual_player.decreaseScore(hit);

                if(actual_player.getScore() < 0){
                    actual_player.setScore(actual_score);
                    notifyPlayerObservers(actual_player);
                } else {
                    notifyPlayerObservers(actual_player);
                }

                hit_counter = 0;
                changePlayer();
                break;
        }
    }

    public void changePlayer(){
        previous_player = pi.getPrev();
        actual_player = pi.next();
        notifyPlayerObservers(actual_player.getId(),previous_player.getId());
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getGame() {
        return game;
    }
}

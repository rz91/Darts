package model;

import iterator.PlayerIterator;
import observer.PlayerSubject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class X01Model extends PlayerSubject {
    BufferedImage help_board;
    private int numberOfPlayers;
    private int game;
    private Player[] players;
    private PlayerIterator pi;
    private Player actual_player;
    private int actual_score;
    private Player previous_player;
    private int hit_counter;
    private Map<String,String> outs = new HashMap<>();

    public X01Model(int game, int numberOfPlayers){

        this.initialise(game,numberOfPlayers);

    }

    public void initialise(int game, int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
        this.game = game;
        this.hit_counter = 0;

        initialiseHelpBoard();
        initialiseOutMap();
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
            players[i] = new Player(this.game,i,outs);
            players[i].setOut();
        }

        pi = new PlayerIterator(players);
        actual_player = pi.next();
        previous_player = pi.getPrev();

    }

    public void initialiseOutMap(){
        try {
            BufferedReader f = new BufferedReader(new FileReader("files/out.txt"));
            String zeile;
            while ( (zeile = f.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(zeile,",");
                outs.put(st.nextToken(),st.nextToken());
            }
        } catch (Exception e) {System.err.print("datei blubla");}
    }

    public void calculateScore (int x , int y){
        int hit = new Color(help_board.getRGB(x,y)).getRed();
        hit_counter++;

        switch (hit_counter) {
            case 1:
                actual_score = actual_player.getScore();
                actual_player.decreaseScore(hit);

                if(checkOverthrow()){
                    actual_player.setScore(actual_score);
                    actual_player.setOut();
                    notifyPlayerObservers(actual_player,hit_counter);
                    hit_counter = 0;
                    changePlayer();
                } else {
                    actual_player.setOut();
                    notifyPlayerObservers(actual_player,hit_counter);
                }

                break;
            case 2:
                actual_player.decreaseScore(hit);

                if(checkOverthrow()){
                    actual_player.setScore(actual_score);
                    actual_player.setOut();
                    notifyPlayerObservers(actual_player,hit_counter);
                    hit_counter = 0;
                    changePlayer();
                } else {
                    actual_player.setOut();
                    notifyPlayerObservers(actual_player,hit_counter);
                }

                break;
            case 3:
                actual_player.decreaseScore(hit);

                if(checkOverthrow()){
                    actual_player.setScore(actual_score);
                    actual_player.setOut();
                    notifyPlayerObservers(actual_player,hit_counter);
                } else {
                    actual_player.setOut();
                    notifyPlayerObservers(actual_player,hit_counter);
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

    public boolean checkOverthrow(){
        return actual_player.getScore() < 0;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getGame() {
        return game;
    }
}

package model;

import java.util.HashMap;
import java.util.Map;

public class Player {
    protected int id;
    protected int score;
    protected String out;
    private Map<String,String> outs;


    public Player(int score, int id, Map<String,String> outs){
        this.outs = outs;
        this.score = score;
        this.id = id;
    }

    public void decreaseScore(int hit){
        this.score -= hit;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setOut() {

        this.out = outs.get(String.valueOf(score));
    }

    public String getOut() {
        return out;
    }
}

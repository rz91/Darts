package model;

public class Player {
    protected int score;
    protected int out;

    public Player(int score){
        this.score = score;
        System.out.println(this.score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void decreaseScore(int hit) {
        this.score -= hit;
    }
}

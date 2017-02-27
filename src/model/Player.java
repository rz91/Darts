package model;

public class Player {
    protected int id;
    protected int score;
    protected int out;

    public Player(int score, int id){
        this.score = score;
        this.id = id;
        System.out.println(this.score);
    }

    public int getScore() {
        return score;
    }

    public void decreaseScore(int hit) {
        this.score -= hit;
    }

    public int getId() {
        return id;
    }
}

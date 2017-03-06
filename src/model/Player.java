package model;

public class Player {
    protected int id;
    protected int score;
    protected String out;

    public Player(int score, int id){
        this.score = score;
        this.id = id;
        System.out.println(this.score);
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

    public void setOut(String out) {
        this.out = out;
    }

    public String getOut() {
        return out;
    }
}

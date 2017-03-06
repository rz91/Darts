package components;

import model.Model;

import javax.swing.*;

public class PlayerPanel extends JPanel{
    private JPanel panel1;
    private JTextField name;
    private JLabel score;
    private JLabel out;

    public PlayerPanel(int score, int id){

        this.add(panel1);
        this.setScore(score);
        this.name.setText("Player" + id);

    }

    public int getScore() {
        return Integer.parseInt(score.getText());
    }

    public void setScore(int score) {
        this.score.setText(String.valueOf(score));
    }

    public JLabel getOut() {
        return out;
    }

    public void setOut(JLabel out) {
        this.out = out;
    }

    public String getName() {
        return name.getText();
    }
}

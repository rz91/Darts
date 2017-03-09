package components;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel{
    private JPanel panel1;
    private JTextField name;
    private JLabel score;
    private JLabel scorelabel;
    private JLabel out;
    private Color orange = new Color (203,120,50);
    private Color grey = new Color (43, 43, 43);

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

    public void setOut(String out) {
        this.out.setText(out);
    }

    public String getName() {
        return name.getText();
    }

    public void setHighlighted (){
        setBackground(orange);
        setBorder (BorderFactory.createLineBorder (grey, 4));
        score.setForeground(grey);
        out.setForeground(grey);
        name.setForeground(grey);
        name.setBorder (BorderFactory.createLineBorder (orange,2));
        scorelabel.setForeground(grey);
    }

    public void undoHighlighting () {
        setBackground(grey);
        setBorder (BorderFactory.createLineBorder (orange, 4));
        score.setForeground(orange);
        out.setForeground(orange);
        name.setForeground(orange);
        name.setBorder (BorderFactory.createLineBorder (grey, 2));
        name.setCaretColor(orange);
        scorelabel.setForeground(orange);
    }
}

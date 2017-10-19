package components;

import model.CricketModel;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CricketPanel extends JPanel implements ActionListener{
    private int number_of_players;
    private Dimension dim;
    private JButton reset;
    private CricketPaintField[][] fields;

    public CricketPanel(int number_of_players){

        this.number_of_players = number_of_players;
        dim = new Dimension(95,95);
        this.setBackground(new Color(43,43,43));
        setVisible(true);

        buildCricketPanel();
    }

    public void initialiseFields() {

        fields = new CricketPaintField[number_of_players][9];

        for (int i = 0; i < number_of_players; i++) {
            for (int j = 0; j < 9; j++) {
                fields[i][j] = new CricketPaintField(dim);
            }
        }

    }

    private void buildCricketPanel(){

        MigLayout ml = new MigLayout("insets 20","[]0[]","[]0[]");
        ml.setLayoutConstraints("top, center");
        setLayout(ml);

        this.reset = new JButton("Reset");
        this.reset.setPreferredSize(dim);
        this.reset.addActionListener(this);
        this.reset.setActionCommand("e");
        this.reset.setBackground(new Color(43,43,43));
        this.reset.setForeground(new Color (203,120,50));
        this.reset.setBorder(BorderFactory.createLineBorder(new Color (203,120,50),2));

        add(reset, "cell 0 0");
        add(new CricketLabel("20",dim), "cell 0 1");
        add(new CricketLabel("19",dim), "cell 0 2"); // "cell column row width height"
        add(new CricketLabel("18",dim), "cell 0 3");
        add(new CricketLabel("17",dim), "cell 0 4");
        add(new CricketLabel("16",dim), "cell 0 5");
        add(new CricketLabel("15",dim), "cell 0 6");
        add(new CricketLabel("D",dim), "cell 0 7");
        add(new CricketLabel("T",dim), "cell 0 8");
        add(new CricketLabel("Bull",dim), "cell 0 9");

        this.initialiseFields();

        for(int i = 0; i < number_of_players; i++){
            add(new CricketTextField("Player" + (i + 1),dim), "cell " + (i + 1) + " 0");

            for(int j = 0; j < 9; j++){
                add(fields[i][j],"cell " + (i + 1) + " " + (j + 1));
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < number_of_players; i++) {
            for (int j = 0; j < 9; j++) {
                fields[i][j].setClickCounter(0);
                fields[i][j].repaint();
            }


        }
    }
}

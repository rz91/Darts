package components;

import controller.X01Controller;

import javax.swing.*;
import java.awt.*;


public class DartBoardPanel extends JPanel {

    public DartBoardPanel(X01Controller c){
        this.initialise();
        this.initialiseDartBoard(c);

    }

    private void initialise(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        this.setVisible(true);
    }

    public void initialiseDartBoard(X01Controller c){

        DartBoardLabel dartboardlabel = new DartBoardLabel();
        dartboardlabel.addMouseListener(c);
        add(dartboardlabel);

    }



}

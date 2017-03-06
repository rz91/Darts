package components;

import controller.MainController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DartBoardPanel extends JPanel {

    public DartBoardPanel(MainController c){
        this.initialise();
        this.initialiseDartBoard(c);

    }

    private void initialise(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        this.setVisible(true);
    }

    public void initialiseDartBoard(MainController c){

        DartBoardLabel dartboardlabel = new DartBoardLabel();
        dartboardlabel.addMouseListener(c);
        add(dartboardlabel);

    }



}

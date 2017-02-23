package view;

import controller.DartBoardViewController;
import model.Model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DartBoardView extends JPanel {
    private Model m;
    private DartBoardViewController c;

    public DartBoardView(Model m){
        this.m = m;
        this.c = new DartBoardViewController(this,m);
        this.initialise();

    }

    private void initialise(){
        this.add(initialiseDartBoard());
        this.setVisible(true);
    }

    private JLabel initialiseDartBoard(){

        JLabel dartboardlabel = new JLabel();
        dartboardlabel.addMouseListener(c);

        try{
            BufferedImage dartboard = ImageIO.read(new File("images/Dartboard.png"));
            dartboardlabel.setIcon(new ImageIcon(dartboard));
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    return dartboardlabel;
    }

}

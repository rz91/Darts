package view;

import controller.DartBoardViewController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DartBoardView extends JPanel {

    private DartBoardViewController c;

    public DartBoardView(){

        this.c = new DartBoardViewController(this);
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
            System.out.println(ex.getMessage());
        }

    return dartboardlabel;
    }

}

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

    public DartBoardPanel(){
        this.initialise();

    }

    private void initialise(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        this.setVisible(true);
    }

    public JLabel initialiseDartBoard(MainController c){

        JLabel dartboardlabel = new JLabel();
        dartboardlabel.addMouseListener(c);
        add(dartboardlabel);

        try{
            BufferedImage dartboard = ImageIO.read(new File("images/Dartboard.png"));
            dartboardlabel.setIcon(new ImageIcon(dartboard));
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    return dartboardlabel;
    }



}

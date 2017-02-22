package view;

import controller.DartBoardViewController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DartBoardView extends JLabel {

    private DartBoardViewController c;

    public DartBoardView(){

        this.c = new DartBoardViewController(this);
        this.addMouseListener(c);
        this.initialise();

    }

    private void initialise(){

        try{
            BufferedImage dartboard = ImageIO.read(new File("images/Dartboard.png"));
            this.setIcon(new ImageIcon(dartboard));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

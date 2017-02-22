package view;

import controller.DartBoardLabelController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DartBoardLabel extends JLabel {

    public DartBoardLabel(DartBoardLabelController c){

        try{
            BufferedImage dartboard = ImageIO.read(new File("images/Dartboard.png"));
            this.setIcon(new ImageIcon(dartboard));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        addMouseListener(c);

    }

}

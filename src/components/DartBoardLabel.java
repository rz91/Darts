package components;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DartBoardLabel extends JLabel {

    DartBoardLabel(){
        try{
            BufferedImage dartboard = ImageIO.read(new File("images/Dartboard.png"));
            setIcon(new ImageIcon(dartboard));
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }

}

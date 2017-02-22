package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by ronnyzingler on 21.02.17.
 */
public class DartBoardLabel extends JLabel implements MouseListener {
    BufferedImage dartboard_black = null;

    public DartBoardLabel(){
        try{
            this.dartboard_black = ImageIO.read(new File("images/Dartboard_black.png"));
            BufferedImage dartboard = ImageIO.read(new File("images/Dartboard.png"));
            this.setIcon(new ImageIcon(dartboard));
            this.addMouseListener(this);
        } catch (IOException ex){}
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int r = new Color(dartboard_black.getRGB(x,y)).getRed();

        System.out.println(r);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

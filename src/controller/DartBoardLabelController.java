package controller;

import view.DartBoardLabel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DartBoardLabelController extends MouseAdapter{

    private DartBoardLabel dbl;
    private BufferedImage help_board;

    public DartBoardLabelController (){

        this.dbl = new DartBoardLabel(this);

        try{
            help_board = ImageIO.read(new File("images/Dartboard_black.png"));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int r = new Color(help_board.getRGB(x,y)).getRed();

        System.out.println(r);
    }

    public DartBoardLabel getDbl() {
        return dbl;
    }
}

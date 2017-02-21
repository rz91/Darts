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
public class DartBoard extends JLabel implements MouseListener {
    BufferedImage picture_mouse = null;

    public DartBoard(){
        try{
            this.picture_mouse = ImageIO.read(new File("src/Dartboard_black.png"));
            BufferedImage dartboard = ImageIO.read(new File("src/Dartboard.png"));
            this.setIcon(new ImageIcon(dartboard));
            this.addMouseListener(this);
        } catch (IOException ex){}
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int r = new Color(picture_mouse.getRGB(x,y)).getRed();
        int g = new Color(picture_mouse.getRGB(x,y)).getGreen();
        int b = new Color(picture_mouse.getRGB(x,y)).getBlue();

        System.out.println(x + " " + y + " " + r + " " + g + " " + b);
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

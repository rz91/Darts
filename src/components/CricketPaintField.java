package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class CricketPaintField extends JPanel implements MouseListener{
    private int click_counter;

    public CricketPaintField(Dimension dim){
        setPreferredSize(dim);
        setOpaque(false);
        addMouseListener(this);
        setBorder(BorderFactory.createLineBorder(new Color (203,120,50),2));

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(6));
        g2.setColor(new Color (203,120,50));

        switch(click_counter){
            case 1:
                g2.drawLine(20,20,this.getWidth() -20,this.getHeight() - 20);
                break;
            case 2:
                g2.drawLine(20,20,this.getWidth() -20,this.getHeight() - 20);
                g2.drawLine(20,this.getWidth() - 20,this.getHeight() - 20, 20);
                break;
            case 3:
                g2.drawLine(20,20,this.getWidth() -20,this.getHeight() - 20);
                g2.drawLine(20,this.getWidth() - 20,this.getHeight() - 20, 20);
                g2.drawOval(20,20,this.getWidth() - 40,this.getHeight() - 40);
                break;
            case 4:
                click_counter = 0;
                break;
        }

    }

    public void setClickCounter(int click_counter) {
        this.click_counter = click_counter;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        click_counter++;
        repaint();
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

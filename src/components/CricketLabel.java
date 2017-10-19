package components;

import javax.swing.*;
import java.awt.*;


public class CricketLabel extends JLabel{

    CricketLabel(String text,Dimension dim){
        super(text);

        setPreferredSize(dim);
        setFont(new Font("Dialog",Font.PLAIN,48));
        setBorder(BorderFactory.createLineBorder(new Color (203,120,50),2));
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setForeground(new Color (203,120,50));
        setOpaque(false);

    }
}

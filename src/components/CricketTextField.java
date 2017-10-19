package components;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ronny on 10.03.2017.
 */
public class CricketTextField extends JTextField {

    CricketTextField(String text,Dimension dim){
        super(text);

        setPreferredSize(dim);
        setFont(new Font("Dialog",Font.PLAIN,25));
        setHorizontalAlignment(CENTER);
        setForeground(new Color (203,120,50));
        setBorder(BorderFactory.createLineBorder(new Color (203,120,50),2));
        setCaretColor(new Color (203,120,50));
        setOpaque(false);

    }
}


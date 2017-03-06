package components;

import javax.swing.*;
import java.awt.*;

public class WinDialog extends JDialog {

    WinDialog(String playername){
        setModal(true);
        this.setLocationRelativeTo(null);
        JLabel winlabel = new JLabel(playername + " has won!");
        winlabel.setFont(new Font("Verdana", Font.BOLD, 50));
        add(winlabel);
        pack();
        setVisible(true);
    }
}

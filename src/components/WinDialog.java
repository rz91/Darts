package components;

import javax.swing.*;

public class WinDialog extends JDialog {

    WinDialog(String playername){
        setSize(200,200);
        setModal(true);
        this.setLocationRelativeTo(null);
        add(new JLabel(playername + " has won!"));
        setVisible(true);
    }
}

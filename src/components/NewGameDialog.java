package components;

import model.X01Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ronny on 10.03.2017.
 */
public class NewGameDialog extends JDialog implements ActionListener{
    private JButton jaButton;
    private JButton neinButton;
    private JPanel panel1;
    private X01Model m;
    private GamePanel gp;

    public NewGameDialog(X01Model m, GamePanel gp){

        this.m = m;
        this.gp = gp;
        jaButton.addActionListener(this);
        jaButton.setActionCommand("j");
        neinButton.addActionListener(this);
        neinButton.setActionCommand("n");
        add(panel1);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setVisible(true);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == "j"){
            m.initialise(m.getGame(),m.getNumberOfPlayers());
            gp.reset();
            dispose();
        } else {
            System.exit(0);
        }
    }

}

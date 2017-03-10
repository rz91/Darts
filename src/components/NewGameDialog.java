package components;

import model.X01Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameDialog extends JDialog implements ActionListener{
    X01Model m;


    public NewGameDialog(X01Model m){
        this.m = m;
        JButton nb = new JButton("Neues Spiel");
        nb.addActionListener(this);
        add(nb);
        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        m.initialise(m.getGame(),m.getNumberOfPlayers());
        dispose();
    }
}

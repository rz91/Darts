package view;

import controller.StartDialogController;

import javax.swing.*;
import java.awt.*;


public class StartDialog extends JFrame{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private StartDialogController c;
    private JButton startGameButton;
    private JPanel panel1;

    public StartDialog(){

        c = new StartDialogController(this);
        this.initialise();
    }

    private void initialise(){

        panel1.setBackground(Color.WHITE);
        startGameButton.addActionListener(c);

        this.setSize(300,300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

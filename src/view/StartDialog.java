package view;

import controller.StartDialogController;

import javax.swing.*;
import java.awt.*;


public class StartDialog extends JFrame{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    public JButton startGameButton;
    private JPanel panel1;

    public StartDialog( StartDialogController c){

        int size_x = 300;
        int size_y = 300;
        panel1.setBackground(Color.WHITE);
        setSize(size_x,size_y);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(panel1);
        startGameButton.addActionListener(c);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

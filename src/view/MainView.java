package view;

import javax.swing.*;
import java.awt.*;


public class MainView extends JFrame {

   public MainView(){

        getContentPane().setLayout(new FlowLayout());
        DartBoardLabel dbl = new DartBoardLabel();
        JPanel dartboard = new JPanel();
        dartboard.add(dbl);
        GameView gv = new GameView();
        add(dartboard);
        add(gv);
        setResizable(false);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

package view;

import controller.DartBoardLabelController;
import controller.GameViewController;

import javax.swing.*;
import java.awt.*;


public class MainView extends JFrame {
     public MainView(){

        DartBoardLabelController dblc = new DartBoardLabelController();
        GameViewController gvc = new GameViewController();

        add(dblc.getDbl());
        add(gvc.getGv());

        getContentPane().setLayout(new FlowLayout());
        makeFrameFullSize(this);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
     }

     private void makeFrameFullSize(JFrame aFrame)
     {
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
          aFrame.setSize(screenSize.width, screenSize.height);
     }
}

package view;

import model.Model;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

   private Model m;
   private DartBoardView dbl;
   private GameView gv;

     public MainWindow(){
        this.m = new Model();
        this.dbl = new DartBoardView(m);
        this.gv = new GameView(m);
        this.initialise();
     }

     private void initialise(){

         this.add(dbl);
         this.add(gv);

         this.getContentPane().setLayout(new FlowLayout());
         this.makeFrameFullSize(this);
         this.setResizable(false);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         this.setVisible(true);
     }

     private void makeFrameFullSize(JFrame aFrame)
     {
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
          aFrame.setSize(screenSize.width, screenSize.height);
     }
}

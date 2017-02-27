package view;

import components.DartBoardPanel;
import components.GamePanel;
import controller.MainController;
import model.Model;

import javax.swing.*;
import java.awt.*;


public class MainView extends JFrame{

   private Model m;
   private MainController c;
   private DartBoardPanel dbl;
   private GamePanel gv;

     public MainView(Model m){

        this.m = m;
         this.c = new MainController(m);
         this.dbl = new DartBoardPanel();
        this.gv = new GamePanel(m);

        this.initialise();
     }

     private void initialise(){

         this.dbl.initialiseDartBoard(c);
         this.add(dbl);
         this.add(gv);

         this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
         this.pack();
         this.setResizable(false);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         this.setVisible(true);
     }

}

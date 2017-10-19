package view;

import components.DartBoardPanel;
import components.GamePanel;
import controller.X01Controller;
import model.X01Model;

import javax.swing.*;
import java.awt.*;


public class X01View extends View{

   private X01Model m;
   private X01Controller c;
   private DartBoardPanel dbl;
   private GamePanel gv;

     public X01View(X01Model m){

        this.m = m;
        this.c = new X01Controller(m);
        this.dbl = new DartBoardPanel(c);
        this.gv = new GamePanel(m);

        this.initialise();
     }

     public void initialise(){

         this.add(dbl);
         this.add(gv);
         this.dbl.setOpaque(false);
         this.gv.setOpaque(false);

         this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
         this.getContentPane().setBackground(new Color(60, 63, 65));
         this.pack();
         this.setBackground(Color.white);
         this.setLocationRelativeTo(null);
         //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         //this.setResizable(false);
         //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         this.setVisible(true);
     }

}

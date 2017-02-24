package controller;

import model.Model;
import view.DartBoardView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DartBoardViewController extends MouseAdapter{
    private Model m;
    private DartBoardView dbl;

    public DartBoardViewController(DartBoardView dbl, Model m){
        this.m = m;
        this.dbl = dbl;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        m.getHit(x,y);

    }

}

package controller;

import model.X01Model;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class X01Controller extends MouseAdapter {
    private X01Model m;

    public X01Controller(X01Model m){

        this.m = m;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        m.calculateScore(x,y);
    }
}

package controller;

import model.Model;
import view.MainView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainController extends MouseAdapter {
    private Model m;

    public MainController(Model m){

        this.m = m;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        m.getHit(x,y);
    }
}

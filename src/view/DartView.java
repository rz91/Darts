package view;

import javax.swing.*;


/**
 * Created by ronnyzingler on 21.02.17.
 */
public class DartView extends JPanel{

    DartView(){
        add(new DartBoard());
        setVisible(true);
    }

}

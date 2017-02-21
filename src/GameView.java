import javax.swing.*;
import java.io.IOException;

/**
 * Created by ronnyzingler on 21.02.17.
 */
public class GameView extends JFrame {

    GameView(){

        DartView dv = new DartView();
        add(dv);
        setResizable(false);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

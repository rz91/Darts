import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by ronnyzingler on 21.02.17.
 */
public class StartDialogController implements ActionListener {

    private StartDialog sd;

    public StartDialogController (StartDialog sd){
        this.sd = sd;
        sd.startGameButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        GameView gv = new GameView();
        sd.dispose();
    }
}

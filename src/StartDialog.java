import javax.swing.*;
import java.awt.*;

/**
 * Created by Ronny on 20.02.2017.
 */
public class StartDialog extends JFrame{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    public JButton startGameButton;
    private JPanel panel1;

    public StartDialog(){
        int size_x = 300;
        int size_y = 300;
        panel1.setBackground(Color.WHITE);
        setSize(size_x,size_y);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}

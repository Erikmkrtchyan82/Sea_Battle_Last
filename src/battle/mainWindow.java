package battle;

import javax.swing.*;
import java.awt.*;

public class mainWindow extends JFrame {

    public static Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    playerWindow playerWindow;
    gameWindow gameWindow;
    Mylabel random, start;

    public mainWindow() {

        setTitle("Sea Battle");
        setSize(d.width, d.height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/battle/pictures/logo.png")).getImage());
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);
        window.frame = this;

        playerWindow = new playerWindow(d.width / 2 - 5, 0, d.width / 2, d.height);
        playerWindow.setVisible(false);

        random = new Mylabel(this, playerWindow, gameWindow, "Random", 300, 200, 100, 100);

        getContentPane().add(playerWindow);

        setVisible(true);
    }
}


import com.sun.glass.ui.InvokeLaterDispatcher;

import javax.swing.*;

/**
 * Created by twer on 1/4/14.
 */
public class MainGame {
    private GameGUI gameGUI;

    public MainGame() {
        gameGUI = new GameGUI();
    }

    public static void main(String[] args) {
        System.out.println("PlaneShootingGame Start!");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainGame mainGame = new MainGame();
            }
        });
    }
}

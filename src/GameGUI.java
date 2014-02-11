import javax.swing.*;
import java.awt.*;

/**
 * Created by twer on 1/4/14.
 */
public class GameGUI {

    private static String GAME_NAME = "PlaneShootingGame";
    private JFrame mainFrame;
    private JButton beginBtn;
    private JButton sendBtn;
    private JPanel airportPanel;
    private double ratio_Of_gameWnd_Screen = 0.75;
    private int screenHeight;
    private int screenWidth;


    public GameGUI()
    {
        setUpGuiPos();
        beginBtn = new JButton("begin");
        sendBtn = new JButton("send");
        mainFrame.add(beginBtn, BorderLayout.NORTH);
        airportPanel = new JPanel();
        sendBtn.setSize(200, 100);
        airportPanel.add(sendBtn);
        airportPanel.setBackground(Color.BLUE);
        mainFrame.add(airportPanel, BorderLayout.WEST);


        mainFrame.setVisible(true);
    }

    private void setUpGuiPos() {
        mainFrame = new JFrame(GAME_NAME);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dm = kit.getScreenSize();
        screenHeight = (int) dm.getHeight();
        screenWidth = (int) dm.getWidth();

        mainFrame.setSize((int)(screenWidth * ratio_Of_gameWnd_Screen),
                          (int) (screenHeight * ratio_Of_gameWnd_Screen));

        int top_left_pos_x = (int) (screenWidth * (1 - ratio_Of_gameWnd_Screen) / 2);
        int top_left_pos_y = (int) (screenHeight * (1 - ratio_Of_gameWnd_Screen) / 2);
        mainFrame.setLocation(top_left_pos_x, top_left_pos_y);
    }
}

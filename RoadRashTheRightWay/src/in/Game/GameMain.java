package in.Game;

import javax.swing.*;

public class GameMain {
    public static final int GAMEHEIGHT=700;
    public static final int GAMEWIDTH=500;

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        GamePanel panel=new GamePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

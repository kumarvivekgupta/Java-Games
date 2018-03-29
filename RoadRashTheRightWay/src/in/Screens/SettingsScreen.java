package in.Screens;

import in.Game.GamePanel;

import java.awt.*;

public class SettingsScreen extends Screen {
    public SettingsScreen(GamePanel p) {
        super(p);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.gray);

    }
}

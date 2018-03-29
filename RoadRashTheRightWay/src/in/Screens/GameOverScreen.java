package in.Screens;

import in.Game.GamePanel;

import java.awt.*;

public class GameOverScreen extends Screen {
    public GameOverScreen(GamePanel p) {
        super(p);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.red);
       g.drawString("Game Over Press Any Key ",100,100);
    }

    @Override
    public void keyPressed(int keyCode) {
        super.keyPressed(keyCode);
        this.panel.currentScreen=new Stage1Screen(panel);
    }
}

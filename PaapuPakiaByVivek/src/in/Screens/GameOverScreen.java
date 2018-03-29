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
        g.setColor(Color.white);
        g.drawString("Press Any Key To Continue",200,250);
    }

    @Override
    public void mousePressed(int xCord, int yCord) {
        super.mousePressed(xCord, yCord);

    }

    @Override
    public void keyPressed(int keyCode) {
        super.keyPressed(keyCode);
        this.panel.currentScreen=new Stage1Screen(panel);
    }

}

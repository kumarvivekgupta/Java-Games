package Screens;

import OOPS.GamePanel;

import java.awt.*;

public class GameOverScreen extends Screen {
    public GameOverScreen(GamePanel panel) {
        super(panel);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.green);
        g.drawString("Game Over Press Any Key To Continue",100,200);

    }

    @Override
    public void keyPressed(int keycode) {
        super.keyPressed(keycode);
        this.p.currentScreen=new Stage1Screen(this.p);
    }
}

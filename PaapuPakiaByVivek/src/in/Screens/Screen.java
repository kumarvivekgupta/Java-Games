package in.Screens;

import in.Entity.Entity;
import in.Game.GamePanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Screen {
    List<Entity> entities = new ArrayList<>();
    public GamePanel panel;
    public int score;


    public Screen(GamePanel p) {
        this.panel = p;
    }

    public void update() {
        for (Entity e : this.entities) {
            e.update();
        }


    }

    public void draw(Graphics g) {
        for (Entity e : this.entities) {

            g.drawImage(e.image, e.x, e.y, null);

        }

    }

    public void mousePressed(int xCord, int yCord) {

    }

    public void keyPressed(int keyCode) {

    }

    public void mouseReleased(int xCord, int yCord) {

    }
}

package Screens;

import Entities.Block;
import Entities.Player;
import OOPS.Game;
import OOPS.GamePanel;
import res.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Stage1Screen extends Screen {
    private final int GROUND_HEIGHT = 360;
    private List<Block> blocks = new ArrayList<>();
    private Player player;


    public Stage1Screen(GamePanel panel) {
        super(panel);
        this.blocks.add(new Block(900, 405));
        this.blocks.add(new Block(1100, 405));
        this.blocks.add(new Block(1300, 405));
        this.blocks.add(new Block(1500, 405));
        this.blocks.add(new Block(1700, 405));
        this.player = new Player(400, GROUND_HEIGHT);
        this.entities.addAll(this.blocks);
        this.entities.add(this.player);
    }

    @Override
    public void update() {
        super.update();
        for (Block b : blocks) {
            if (b.x < -20) {
                b.x = 980;
                b.isVisible = true;
            }
            if (b.isCollision(this.player)) {
                Resources.hitAudio.play();
                this.player.x -= 30;
                b.isVisible = false;


            }
        }
        if (this.player.y >= GROUND_HEIGHT && this.player.yVelo != 0) {
            this.player.y = GROUND_HEIGHT;
            this.player.land();
        }
        if (this.player.x < 0) {
            this.p.currentScreen = new GameOverScreen(this.p);
        }


    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.grassImage, 0, Game.HEIGHT - 45, null);
        super.draw(g);


    }

    @Override
    public void keyPressed(int keycode) {
        super.keyPressed(keycode);
        if (keycode == KeyEvent.VK_SPACE && this.player.y >= GROUND_HEIGHT) {
            this.player.jump();

        }
    }
}

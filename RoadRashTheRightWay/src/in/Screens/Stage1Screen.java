package in.Screens;

import in.Entitties.Block;
import in.Entitties.Cars;
import in.Entitties.Player;
import in.Game.GameMain;
import in.Game.GamePanel;
import in.res.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stage1Screen extends Screen {
    private List<Block> blockImages = new ArrayList<>();
    private List<Cars> carImages = new ArrayList<>();
    private Player player;
    private Random a = new Random();
    private int n;

    public Stage1Screen(GamePanel p) {
        super(p);
        this.blockImages.add(new Block(0, 10));
        this.blockImages.add(new Block(0, -100));
        this.blockImages.add(new Block(0, -200));
        this.blockImages.add(new Block(0, -300));
        this.blockImages.add(new Block(0, -400));
        this.blockImages.add(new Block(0, -500));
        this.blockImages.add(new Block(0, -600));
        this.blockImages.add(new Block(480, 10));
        this.blockImages.add(new Block(480, -100));
        this.blockImages.add(new Block(480, -200));
        this.blockImages.add(new Block(480, -300));
        this.blockImages.add(new Block(480, -400));
        this.blockImages.add(new Block(480, -500));
        this.blockImages.add(new Block(480, -600));
        this.player = new Player(75, 550);
        this.carImages.add(new Cars(75, 100));
        this.carImages.add(new Cars(250, 100));

        this.entities.add(this.player);
        this.entities.addAll(this.blockImages);
        this.entities.addAll(this.carImages);


    }

    @Override
    public void update() {
        super.update();
        for (Block b : blockImages) {
            if (b.y > 720) {
                b.y = -20;
            }
            for (Cars c : carImages) {
                if (c.y > 750) {
                    c.y = -50;
                    n = a.nextInt(3);
                    if (n == 0) {
                        c.x = 75;
                    } else if (n == 1) {
                        c.x = 250;
                    } else
                        c.x = 390;
                }
                if (c.isCollision(this.player)) {
                    this.panel.currentScreen = new GameOverScreen(panel);
                }
            }

        }


    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.blue);
        g.fillRect(0, 0, 175, GameMain.GAMEHEIGHT);
        g.setColor(Color.red);
        g.fillRect(175, 0, 150, GameMain.GAMEHEIGHT);
        g.setColor(Color.gray);
        g.fillRect(325, 0, 175, GameMain.GAMEHEIGHT);
        g.setColor(Color.green);
        g.fillRect(0, 0, 25, GameMain.GAMEHEIGHT);
        g.fillRect(475, 0, 25, GameMain.GAMEHEIGHT);
        super.draw(g);


    }

    @Override
    public void keyPressed(int keyCode) {
        super.keyPressed(keyCode);
        if (keyCode == KeyEvent.VK_RIGHT) {
            if (this.player.x == 75) {
                this.player.x = 250;
            } else if (this.player.x == 250) {
                this.player.x = 395;
            } else if (this.player.x == 395) {
                this.panel.currentScreen = new GameOverScreen(panel);
            }
        }
        if (keyCode == KeyEvent.VK_LEFT) {

            if (this.player.x == 250) {
                this.player.x = 75;
            } else if (this.player.x == 395) {
                this.player.x = 250;
            } else if (this.player.x == 75) {
                this.panel.currentScreen = new GameOverScreen(panel);
            }
        }
    }
}

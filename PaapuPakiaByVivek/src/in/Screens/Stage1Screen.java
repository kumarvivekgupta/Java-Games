package in.Screens;

import in.Entity.*;
import in.Game.GamePanel;
import in.res.Resources;
import javafx.scene.paint.Color;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Stage1Screen extends Screen {
    private List<Logs> blockImages = new ArrayList<>();
    private List<ForkHead> forkHeadImages = new ArrayList<>();
    private List<ForkHeadDown> forkHeadDownImages = new ArrayList<>();
    private Bird bird;
    private Star star;
    private int visibility=0;
    private int logX=200;


    public Stage1Screen(GamePanel p) {
        super(p);
        blockImages.add(new Logs(100,-130));
        blockImages.add(new Logs(500, -130));
        forkHeadDownImages.add(new ForkHeadDown(495, 180));
        blockImages.add(new Logs(800, -100));
        blockImages.add(new Logs(1100, -120));
        forkHeadDownImages.add(new ForkHeadDown(1095, 170));
        blockImages.add(new Logs(1300, -130));
        //  blockImages.add(new Logs(500, 350));
        //  forkHeadImages.add(new ForkHead(492, 291));
        blockImages.add(new Logs(700, 375));
        forkHeadImages.add(new ForkHead(692, 316));
        blockImages.add(new Logs(1000, 350));

        blockImages.add(new Logs(1500, 380));
        forkHeadImages.add(new ForkHead(1492, 321));
        this.star = new Star(500, 300);
        this.bird = new Bird(200, 300);
        this.entities.addAll(this.blockImages);
        this.entities.addAll(this.forkHeadImages);
        this.entities.addAll(this.forkHeadDownImages);
        this.entities.add(bird);
        this.entities.add(star);

    }

    @Override
    public void update() {
        super.update();
        visibility++;



        for (Logs b : blockImages) {
            if (b.x < 0) {
                b.x = 1100;
                this.score += 5;
            }
            if (b.isCollision(bird)) {
                this.panel.currentScreen = new GameOverScreen(panel);
            }
        }
        for (ForkHead f : forkHeadImages) {
            if (f.x < 0)
                f.x = 1100;
            if (f.isCollision(bird)) {
                this.panel.currentScreen = new GameOverScreen(panel);
            }
        }
        for (ForkHeadDown fd : forkHeadDownImages) {
            if (fd.x < 0) {
                fd.x = 1100;
            }
            if (fd.isCollision(bird)) {
                this.panel.currentScreen = new GameOverScreen(panel);
            }

        }
        if (bird.isCollision(star)) {
            this.bird.isVisible=false;
             this.bird.height=0;
             this.bird.width=0;
            visibility=0;
        }
        if(visibility>100){
            this.bird.isVisible=true;
            this.bird.height=60;
            this.bird.width=60;

        }
        if((bird.y>500)|| bird.y<0)
            this.panel.currentScreen=new GameOverScreen(panel);


    }

    @Override
    public void draw(Graphics g) {

        g.drawImage(Resources.bg_combined, 0, -30, null);
        g.drawImage(Resources.ground, 0, 0, null);
        g.drawImage(Resources.grass, 0, 0, null);
        g.setColor(java.awt.Color.black);
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString(score + "", 10, 30);
        if(score==0)
        g.drawImage(Resources.log,(logX),360,null);
        super.draw(g);
    }


    @Override
    public void keyPressed(int keyCode) {
        super.keyPressed(keyCode);
        if (keyCode == KeyEvent.VK_UP) {
            this.bird.jump();

        }
        if (keyCode == KeyEvent.VK_DOWN) {
            this.bird.jump();

        }


    }

    @Override
    public void mousePressed(int xCord, int yCord) {
        super.mousePressed(xCord, yCord);
        this.bird.jump();
        //   bird.yVelo-=3;
    }


}

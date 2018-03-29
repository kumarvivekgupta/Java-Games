package in.Screens;

import in.Game.GameMain;
import in.Game.GamePanel;
import in.res.Resources;

import java.awt.*;

public class WelcomeScreen extends Screen {
    private int xCordPlay = 600;
    private int yCordPlay = 150;
    private int xCordSetting = 600;
    private int yCordSetting = 300;

    public WelcomeScreen(GamePanel p) {
        super(p);
    }

    @Override
    public void update() {
        super.update();


    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        Resources.gameAudio.play();
        g.drawImage(Resources.bg_combined, 0, -30, null);
        g.drawImage(Resources.log, 100, 310, null);
        g.drawImage(Resources.ground, 0, 0, null);
        g.drawImage(Resources.grass, 0, 0, null);
        g.drawImage(Resources.pappu3, 100, 270, null);
        g.drawImage(Resources.stand, 700, 100, null);
        g.drawImage(Resources.plankMid, 600, 300, null);
        g.drawImage(Resources.plankTop, 600, 150, null);
        g.setColor(Color.white);
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("PLAY", 650, 180);
        g.drawString("SETTINGS", 650, 330);
        g.drawImage(Resources.controls,350,350,null);


    }

    @Override
    public void mousePressed(int xCord, int yCord) {
        super.mousePressed(xCord, yCord);
        if (xCord >= xCordPlay && xCordPlay <= (xCordPlay + 121) && yCord >= yCordPlay && yCord <= (yCordPlay + 121)) {
            this.panel.currentScreen = new Stage1Screen(panel);
        }
        if (xCord >= yCordSetting && xCord <= (xCordSetting + 95) && yCord >= yCordSetting && yCord <= (yCordSetting + 95)) {
            this.panel.currentScreen = new SettingsScreen(panel);
        }
    }
}

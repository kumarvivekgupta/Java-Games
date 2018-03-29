package Screens;

import OOPS.GamePanel;

import java.awt.*;

public class WelcomeScreen extends Screen {
    private static Color c = Color.red;
    private static final int XCORDPLAY = 400;
    private static final int YCORDPLAY = 200;
    private static int count = 0;
    private static final int XCORDCIRCLE = 350;
    private static final int YCORDCIRCLE = 150;
    private static final int RADIUS = 50;
    private static final int XCORDSETTING = 400;
    private static final int YCORDSETTING = 300;


    public WelcomeScreen(GamePanel panel) {
        super(panel);
    }

    @Override
    public void update() {
        this.count++;
        if (this.count == 30) {
            this.count = 0;
            if (this.c == Color.red)
                this.c = Color.GREEN;
            else
                this.c = Color.red;


        }

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillArc(XCORDCIRCLE, YCORDCIRCLE, RADIUS, RADIUS, 0, 360);

        g.fillRect(XCORDPLAY, YCORDPLAY, 100, 50);
        g.fillRect(XCORDSETTING, YCORDSETTING, 100, 50);

    }

    @Override
    public void mouseclicked(int xCord, int yCord) {
        if (xCord > XCORDPLAY && xCord < (XCORDPLAY + 200) && yCord > YCORDPLAY && yCord < (YCORDPLAY + 100)) {
            this.p.currentScreen = new Stage1Screen(this.p);

        }
        if (xCord > XCORDSETTING && xCord < (XCORDSETTING + 200) && yCord > YCORDSETTING && yCord < (YCORDSETTING + 100)) {
            this.p.currentScreen = new SettingsScreen(this.p);
        }


    }
}

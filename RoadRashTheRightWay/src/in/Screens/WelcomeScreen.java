package in.Screens;

import in.Game.GameMain;
import in.Game.GamePanel;
import in.res.Resources;

import java.awt.*;

public class WelcomeScreen extends Screen {
    private Color c;
    private int xCordPlay=200;
    private int yCordPlay=200;
    private int xCordSetting=200;
    private int yCordSetting=400;
    private int counter=0;


    public WelcomeScreen(GamePanel p) {
        super(p);
    }

    @Override
    public void update() {
        super.update();
        counter++;
        if (counter == 30) {
            if (this.c == Color.green){
                this.c = Color.pink;
                counter=0;
            }

            else{
                this.c = Color.green;
                counter=0;
            }


        }
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.green);
        g.fillRect(0,0, GameMain.GAMEWIDTH,GameMain.GAMEHEIGHT);
        g.fillArc(200,100,50,50,0,360);
        g.drawImage(Resources.play,xCordPlay,yCordPlay,null);
        g.drawImage(Resources.settings,xCordSetting,yCordSetting,null);
    }

    @Override
    public void mousePressed(int xCord,int yCord) {
        super.mousePressed(xCord,yCord);
        if(xCord>=xCordPlay && xCordPlay<=(xCordPlay+121) && yCord>=yCordPlay && yCord<=(yCordPlay+121)){
            this.panel.currentScreen=new Stage1Screen(panel);
        }
        if(xCord>=yCordSetting && xCord<=(xCordSetting+95) && yCord>=yCordSetting && yCord<=(yCordSetting+95)){
            this.panel.currentScreen=new SettingsScreen(panel);
        }
    }
}

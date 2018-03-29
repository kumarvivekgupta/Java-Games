package in.Game;

import in.Screens.Screen;
import in.Screens.WelcomeScreen;
import in.res.Resources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements KeyListener,MouseListener,Runnable{
    public static Screen currentScreen;

    public GamePanel() {
        this.setPreferredSize(new Dimension(GameMain.GAMEWIDTH, GameMain.GAMEHEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);

    }

    @Override
    public void addNotify() {
        super.addNotify();
        Resources.load();
        this.currentScreen = new WelcomeScreen(this);
        Thread gameThread=new Thread(this);
        gameThread.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.currentScreen.keyPressed(e.getKeyCode());

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.currentScreen.mousePressed(e.getX(),e.getY());

    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // this.currentScreen.mouseReleased(e.getX(),e.getY());


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {
        Image bigImage = new BufferedImage(GameMain.GAMEWIDTH, GameMain.GAMEHEIGHT, BufferedImage.TYPE_INT_RGB);
        while (true){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.currentScreen.update();

            Graphics g = this.getGraphics();
            Graphics imageGraphic = bigImage.getGraphics();
            imageGraphic.clearRect(0, 0, GameMain.GAMEWIDTH, GameMain.GAMEHEIGHT);
//            g.clearRect(0, 0, GameMain.GAMEWIDTH, GameMain.GAMEHEIGHT);
            this.currentScreen.draw(imageGraphic);
            imageGraphic.dispose();

            g.drawImage(bigImage, 0, 0, null);
            g.dispose();

        }

    }
}

package in.res;


import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Resources {
    public static BufferedImage back_trees;
    public static BufferedImage berries;
    public static BufferedImage grass;
    public static BufferedImage ground;
    public static BufferedImage log;

    public static BufferedImage angryPakia;
    public static BufferedImage stand;
    public static BufferedImage plankMid;
    public static BufferedImage plankTop;
    public static BufferedImage controls;
    public static BufferedImage fork_handle;
    public static BufferedImage fork_head;
    public static BufferedImage fork_head1;
    public static BufferedImage pappu1;
    public static BufferedImage pappu2;
    public static BufferedImage pappu3;
    public static BufferedImage pappu4;
    public static BufferedImage pappu5;
    public static BufferedImage pappu6;
    public static BufferedImage pappu7;
    public static BufferedImage pappu8;
    public static BufferedImage bg_combined;
    public static java.applet.AudioClip gameAudio;
    public static BufferedImage star;
    public static BufferedImage pappu1light;

    public static void load() {
        try {
            back_trees = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/back_trees.png"));
            berries = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/berries.png"));
            grass = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/grass.png"));
            ground = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/ground.png"));
            log = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/log.png"));
            angryPakia = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/angry_pakia.png"));
            stand = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/stand.png"));
            plankMid = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/plank_mid.png"));
            plankTop = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/plank_top.png"));
            controls = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/controls.png"));
            fork_handle = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/fork_handle.png"));
            fork_head = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/fork_head.png"));
            fork_head1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/fork_head1.png"));
            pappu1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu1.png"));
            pappu2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu2.png"));
            pappu3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu3.png"));
            pappu4 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu4.png"));
            pappu5 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu5.png"));
            pappu6 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu6.png"));
            pappu7 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu7.png"));
            pappu8 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu8.png"));
            bg_combined = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/bg_combined.png"));
            gameAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/res/audio/flap.mp3"));
            star = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/star.png"));
            pappu1light = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/pappu1light.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

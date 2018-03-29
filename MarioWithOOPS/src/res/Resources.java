package res;



import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Resources {
  public static   BufferedImage jumpImage;
    public static BufferedImage playerImage1;
    public static BufferedImage playerImage2;
    public static BufferedImage playerImage3;
    public static BufferedImage playerImage4;
    public static BufferedImage playerImage5;
    public static  BufferedImage grassImage;
    public static BufferedImage blockImage;
    public static AudioClip jumpAudio;
    public static AudioClip hitAudio;



    public static  void load() {

        try {
            jumpImage= ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/jump.png"));
            playerImage1=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/run_anim1.png"));
            playerImage2=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/run_anim2.png"));
            playerImage3=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/run_anim3.png"));
            playerImage4=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/run_anim4.png"));
            playerImage5=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/run_anim5.png"));
            grassImage=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/grass.png"));
            blockImage=ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("res/images/block.png"));
            jumpAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("res/audio/onjump.wav"));
            hitAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("res/audio/hit.wav"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

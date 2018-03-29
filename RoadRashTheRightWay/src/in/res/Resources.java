package in.res;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Resources {
    public static BufferedImage car1;
    public static BufferedImage car2;
    public static BufferedImage car3;
    public static BufferedImage player;
    public static BufferedImage block;
    public static BufferedImage play;
    public static BufferedImage settings;

    public static void load() {
        try {
            car1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/newCar.png"));
            car2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/redCar.png"));
            car3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/newCar.png"));
            block = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/block.png"));
            player = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/car1.png"));
            play = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/play.png"));
            settings = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/res/images/settings.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

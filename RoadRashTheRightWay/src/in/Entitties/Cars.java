package in.Entitties;

import in.res.Resources;

import java.awt.*;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Cars extends Entity {
    private List<BufferedImage> carImage = new ArrayList<>();

    public Cars(int x, int y) {
        super(x, y);
        this.height = 80;
        this.width = 50;
        this.yVelo = 7;
        this.image = (Resources.car1);


    }

    @Override
    public void upadte() {
        super.upadte();

    }

}

package in.Entity;

import in.res.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Bird extends Entity {
    List<Image> birdImages = new ArrayList<>();
    private int currentImage = 0;

    public Bird(int x, int y) {
        super(x, y);
        this.height = 60;
        this.width = 60;



        this.birdImages.add(Resources.pappu1);
        this.birdImages.add(Resources.pappu2);
        this.birdImages.add(Resources.pappu3);
        this.birdImages.add(Resources.pappu4);
        this.birdImages.add(Resources.pappu5);
        this.birdImages.add(Resources.pappu6);
        this.birdImages.add(Resources.pappu7);
        this.birdImages.add(Resources.pappu8);


    }

    @Override
    public void update() {
        super.update();
        currentImage++;
        currentImage = currentImage % 8;
        if(isVisible)
        this.image = this.birdImages.get(currentImage);
        else
            this.image=Resources.pappu1light;

    }
    public void jump(){
        this.yVelo=-5;
        this.yAcc=1;

    }
}

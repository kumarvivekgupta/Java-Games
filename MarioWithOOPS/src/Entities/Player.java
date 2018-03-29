package Entities;


import res.Resources;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Player extends Entity {
    private List<Image> allImages = new ArrayList<>();
    private int currentIndex = 0;


    public Player(int x, int y) {
        super(x, y);
        this.width=72;
        this.height=97;
        this.allImages.add(Resources.playerImage1);
        this.allImages.add(Resources.playerImage2);
        this.allImages.add(Resources.playerImage3);
        this.allImages.add(Resources.playerImage4);
        this.allImages.add(Resources.playerImage5);
        this.allImages.add(Resources.playerImage4);
        this.allImages.add(Resources.playerImage3);
        this.allImages.add(Resources.playerImage2);


    }

    public void update() {
        super.update();
        if (this.inAir)
            this.image = Resources.jumpImage;
        else {
            currentIndex++;
            currentIndex = currentIndex % 8;
            this.image = this.allImages.get(currentIndex);
        }

    }
    public void jump(){
        Resources.jumpAudio.play();
        this.yVelo=-20;
        this.yAcc=1;
        this.inAir=true;

    }
    public void land(){
        this.yVelo=0;
        this.yAcc=0;
        this.inAir=false;
    }
}

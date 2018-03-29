package Entities;

import res.Resources;

public class Block extends Entity {

    public Block(int x, int y) {
        super(x, y);
        this.width=20;
        this.height=50;
        this.xVelo = -5;
        this.image = Resources.blockImage;

    }
}


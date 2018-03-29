package in.Entity;

import in.res.Resources;

public class Star extends Entity {
    public Star(int x, int y) {
        super(x, y);
        this.image = Resources.star;
        this.height = 40;
        this.width = 40;
        this.xVelo = -5;
    }

    @Override
    public void update() {
        super.update();
        if(this.x<0)
            this.x=1100;
    }
}

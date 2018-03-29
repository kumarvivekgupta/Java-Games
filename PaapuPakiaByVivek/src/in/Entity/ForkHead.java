package in.Entity;

import in.res.Resources;

public class ForkHead extends Entity {
    public ForkHead(int x, int y) {
        super(x, y);
        this.xVelo=-5;
        this.height=55;
        this.width=33;
        this.image= Resources.fork_head;
    }

    @Override
    public void update() {
        super.update();
    }
}

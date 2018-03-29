package in.Entity;

import in.res.Resources;

import java.awt.*;

public class ForkHeadDown extends Entity {
    public ForkHeadDown(int x, int y) {
        super(x, y);
        this.xVelo=-5;
        this.width=33;
        this.height=57;
        this.image= Resources.fork_head1;
    }
}

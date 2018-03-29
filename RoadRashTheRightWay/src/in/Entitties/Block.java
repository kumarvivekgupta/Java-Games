package in.Entitties;

import in.res.Resources;

public class Block extends Entity {
    public Block(int x, int y) {
        super(x, y);
        this.yVelo=5;
        this.height=50;
        this.width=20;
        this.image= Resources.block;
    }

    @Override
    public void upadte() {
        super.upadte();

    }
}

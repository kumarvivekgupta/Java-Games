package in.Entity;

import in.res.Resources;

public class Logs extends Entity {


    public Logs(int x, int y) {
        super(x, y);
        this.width = 32;
        this.height = 312;
        this.image= Resources.fork_handle;

        this.xVelo=-5;

    }

    @Override
    public void update() {
        super.update();
    }


}

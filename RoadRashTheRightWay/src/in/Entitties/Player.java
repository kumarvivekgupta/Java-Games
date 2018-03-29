package in.Entitties;

import in.res.Resources;

import java.util.ResourceBundle;

public class Player extends Entity {
    public Player(int x, int y) {
        super(x, y);
        this.height=120;
        this.width=60;
        this.image= Resources.player;

    }

    @Override
    public void upadte() {
        super.upadte();

    }
}

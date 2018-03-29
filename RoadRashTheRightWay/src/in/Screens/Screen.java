package in.Screens;

import in.Entitties.Entity;
import in.Game.GamePanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Screen {
    protected GamePanel panel;
    public List<Entity> entities = new ArrayList<>();
    public List<Entity> carentities=new ArrayList<>();

    public Screen(GamePanel p) {
        this.panel = p;

    }

    public void update() {
        for (Entity e : this.entities)
            e.upadte();
        for(Entity ce:this.carentities)
            ce.upadte();

    }

    public void draw(Graphics g) {
        for(Entity e:this.entities)
            g.drawImage(e.image,e.x,e.y,null);
        for(Entity ce:this.carentities)
            g.drawImage(ce.image,ce.x,ce.y,null);


    }
    public void mousePressed(int xCord,int yCord){

    }
   public void  keyPressed(int keyCode){

    }
}

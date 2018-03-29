package Screens;

import Entities.Entity;
import OOPS.GamePanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

 public class Screen {
    protected GamePanel p;
    List<Entity> entities = new ArrayList<>();


    public Screen(GamePanel panel) {
        super();
        this.p = panel;

    }

    public void update() {
        for(Entity e: this.entities){
            e.update();
        }
    }

     public void draw(Graphics g){
         for(Entity e: this.entities) {
             if(e.isVisible)
         g.drawImage(e.image,e.x,e.y,null);
         }
     }

    public void mouseclicked(int xCord, int yCord) {

    }
    public void  keyPressed(int keycode){

    }
}

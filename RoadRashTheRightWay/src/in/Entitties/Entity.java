package in.Entitties;

import java.awt.*;

public class Entity {
    public int x;
    public int y;
    public int height;
    public int width;
    public int xVelo;
    public int yVelo;
    public int xAcc=0;
    public int yAcc=0;
    public Image image;
   private Rectangle rect=new Rectangle();



    public Entity(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void upadte() {
        x+=xVelo;
        y+=yVelo;
        xVelo+=xAcc;
        yVelo+=yAcc;

    }
   public boolean isCollision(Entity other){
        this.updateRect();
        other.updateRect();
        return this.rect.intersects(other.rect);


    }
  public void updateRect(){
        this.rect.setBounds(this.x,this.y,this.width,this.height);

    }
}

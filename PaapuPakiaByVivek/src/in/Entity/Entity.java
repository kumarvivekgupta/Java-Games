package in.Entity;

import java.awt.*;

public class Entity {
    public int xVelo = 0;
    public int yVelo = 0;
    public int x;
    public int y;
    public int xAcc = 0;
    public int yAcc = 0;
    public Image image;
    public boolean inAir = false;
    public int width;
    public int height;
    private Rectangle rect=new Rectangle();
    public boolean isVisible=true;
    public Entity(int x, int y) {
        super();
        this.x = x;
        this.y = y;

    }
    public void update() {
        x = x + xVelo;
        y = y + yVelo;
        yVelo += yAcc;
        xVelo += xAcc;
    }
   public boolean  isCollision(Entity other){
        this.updateRect();
        other.updateRect();
        return this.rect.intersects(other.rect);

    }
   public void  updateRect(){
        rect.setBounds(this.x,this.y,this.width,this.height);
    }


}

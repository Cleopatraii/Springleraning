package GUI;

import java.awt.*;
import java.awt.image.*;
public class Ship {

    private double x;
    private double y;
    private BufferedImage ship;
    public Ship(double x, double y, Window window){
        this.x = x;
        this.y = y;

        SpriteSheet ss = new SpriteSheet(window.getSpriteSheet());

        ship = ss.grabImage(1,1,48,48);
    }
    //update method
    public void tick() {

    }
    //image method
    public void render(Graphics g) {

        g.drawImage(ship,(int) x,(int) y, null);
    }
}

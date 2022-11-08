package GUI;

import java.awt.*;
import java.awt.image.*;
public class Gamefield {

    private double windowx;
    private double windowy;

    private int fieldx;

    private int fieldy;
    private BufferedImage ship;
    public Gamefield(double x, double y, Window window){
        this.windowx = x;
        this.windowy = y;

        SpriteSheet ss = new SpriteSheet(window.getSpriteSheet());

        ship = ss.grabImage(1,1,48,48);
    }
    //update method
    public void tick() {

    }
    //image method
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(25,25,450,450);
        g.drawRect(525,25,450,450);
        int[][] field = new int[15][15];
        drawfield(25,25,450,450,field,g);
        drawfield(525,25,450,450,field,g);
    }
    public void drawfield(int xoffset, int yoffset, int xsize, int ysize, int[][] field, Graphics g) {
        int fieldsize = field.length;
        for (int i = 0; i < fieldsize; i++) {
            g.drawLine(xoffset + (xsize/fieldsize)*i,yoffset,xoffset+(xsize/fieldsize)*i,yoffset+ ysize);
            g.drawLine(xoffset,yoffset + (ysize/fieldsize)*i,xoffset+xsize,yoffset + (ysize/fieldsize)*i);
        }
    }
}

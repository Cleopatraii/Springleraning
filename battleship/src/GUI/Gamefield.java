package GUI;

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;

public class Gamefield {


    private boolean imagesscaled = false;
    private double windowx;
    private double windowy;

    private int fieldx;

    private int fieldy;
    private BufferedImage ship;
    private  BufferedImage waterhit;
    private  BufferedImage shiphit;
    private  BufferedImage shipsunk;

    public Gamefield(double x, double y, Window window){
        this.windowx = x;
        this.windowy = y;

        BufferedImageLoader loader = new BufferedImageLoader();
        try {
            ship = loader.loadImage("/boat.png");
            waterhit = loader.loadImage("/water1.png");
            shiphit = loader.loadImage("/hit.png");
            shipsunk = loader.loadImage("/sunk.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scaleimage(int size) {

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

    //Spielfeld wird gezeichnet
    public void drawfield(int xoffset, int yoffset, int xsize, int ysize, int[][] field, Graphics g) {
        int fieldsize = field.length;
        if(imagesscaled== false) {
            scaleimage(xsize/fieldsize);
            imagesscaled = true;
        }
        for(int j = 0; j < fieldsize; j++){
            for(int i = 0; i <fieldsize; i ++) {
                switch (field[i][j]) {
                    case 0: break; //Wasser
                    case 1: //schiff

                    case 2: //Wasser getroffen
                    case 3: //Schiff getroffen
                    case 4: //Schiff versenkt
                    default: break;
                }
            }
        }
        for (int i = 0; i < fieldsize; i++) {
            g.drawLine(xoffset + (xsize/fieldsize)*i,yoffset,xoffset+(xsize/fieldsize)*i,yoffset+ ysize);
            g.drawLine(xoffset,yoffset + (ysize/fieldsize)*i,xoffset+xsize,yoffset + (ysize/fieldsize)*i);
        }
    }
}

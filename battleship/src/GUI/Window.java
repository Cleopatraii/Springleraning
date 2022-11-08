package GUI;

import game.Game;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Window extends Canvas implements Runnable {

    @Override
    public void run() {
        init();
        long initTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int update = 0;
        int frame = 0;
        long timer = System.currentTimeMillis();
        while (running) {
            //game loop here
            long now = System.nanoTime();
            delta += (now - initTime) / ns;
            initTime = now;
            if (delta >= 1) {
                tick();
                update++;
                delta--;
            }
            render();
            frame++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println(update + " Ticks, Fps " + frame);
                update = 0;
                frame = 0;
            }
        }
        stop();
    }

    private void tick() {
        gamefield.tick();
    }

    /**
     * Buffer strategy
     */
    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        //--------------------------------------------//
        g.drawImage(backgroundMenu, 0, 0, getWidth(), getHeight(), null);
        if (State == STATE.MENU) {
            menu.render(g);

        }
        if (State == STATE.MENU2) {
            menu.render1(g);

        }
        if (State == STATE.MENU3) {
            menu.render2(g);

        }
        if (State == STATE.GAME) {
            g.drawImage(image, 0,0, getWidth(), getHeight(), this);
            g.setColor(Color.white);
            g.fillRect(0,0,getWidth(),getHeight());
            gamefield.render(g);
        }

        //--------------------------------------------//
        g.dispose();
        bs.show();
    }

    public static final int WIDTH = 500;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static final int SCALE = 2;
    public final String TITLE = "Schiff versenken";
    private Menu menu;
    private boolean running = false;
    private Thread thread;
    private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private BufferedImage spriteSheet = null;
    private BufferedImage backgroundMenu = null;
    public enum STATE {
        MENU,
        //Menu Player Computer
        GAME,
        MENU2,
        //Host Connect Ansicht
        MENU3
        //Connect Anischt mit IP Eingabe
    }

    public static STATE State = STATE.MENU;
    private Gamefield gamefield;
    public void init() {
        requestFocus();
        BufferedImageLoader loader = new BufferedImageLoader();
        try {
            backgroundMenu = loader.loadImage("/hintergrund.png");
            spriteSheet = loader.loadImage("/bluedot.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        menu = new Menu();
        SpriteSheet ss = new SpriteSheet(spriteSheet);
        gamefield = new Gamefield(100,100, this);

        this.addMouseListener(new MouseInput());
    }

    public void start() {
        if (running) return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    private void stop() {
        if (!running) return;

        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(1);
    }

    public BufferedImage getSpriteSheet() {
        return spriteSheet;
    }

}
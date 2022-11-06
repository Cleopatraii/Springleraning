package GUI;
import java.awt.*;

public class Menu {

    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Font fn0t = new Font("arial", Font.BOLD, 50);
        g.setFont(fn0t);
        g.setColor(Color.white);
        g.drawString("Schiffeversenken", Window.WIDTH / 2, 150);

        Rectangle playerbutton =  new Rectangle(Window.WIDTH / 2 + 20, 250, 400,50);
        Rectangle computerbutton =  new Rectangle(Window.WIDTH / 2 + 20, 350, 400,50);
        Rectangle quitbutton = new Rectangle(Window.WIDTH / 2 + 20, 450 , 400, 50);

        Font fnt1 = new Font("Arial", Font.BOLD, 30);
        g.setFont(fnt1);
        g.drawString("Player", playerbutton.x + 150, playerbutton.y + 35);
        g.drawString("Computer", computerbutton.x + 120, computerbutton.y + 35);
        g.drawString("Quit", quitbutton.x + 160, computerbutton.y + 135);
        g2d.draw(playerbutton);
        g2d.draw(computerbutton);
        g2d.draw((quitbutton));

    }
    public void render1(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Font fn0t = new Font("arial", Font.BOLD, 50);
        g.setFont(fn0t);
        g.setColor(Color.white);
        g.drawString("HOST", Window.WIDTH / 2, 150);

        Rectangle playerbutton =  new Rectangle(Window.WIDTH / 2 + 20, 250, 400,50);
        Rectangle computerbutton =  new Rectangle(Window.WIDTH / 2 + 20, 350, 400,50);
        Rectangle quitbutton = new Rectangle(Window.WIDTH / 2 + 20, 450 , 400, 50);

        Font fnt1 = new Font("Arial", Font.BOLD, 30);
        g.setFont(fnt1);
        g.drawString("HOST", playerbutton.x + 150, playerbutton.y + 35);
        g.drawString("CONNECT", computerbutton.x + 120, computerbutton.y + 35);
        g.drawString("Return", quitbutton.x + 160, computerbutton.y + 135);
        g2d.draw(playerbutton);
        g2d.draw(computerbutton);
        g2d.draw((quitbutton));
    }
}

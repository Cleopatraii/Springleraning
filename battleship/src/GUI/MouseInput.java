package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        /**
         *         Rectangle playerbutton =  new Rectangle(Game.WIDTH / 2 + 20, 250, 400,50);
         *         Rectangle computerbutton =  new Rectangle(Game.WIDTH / 2 + 20, 350, 400,50);
         *         Rectangle quitbutton = new Rectangle(Game.WIDTH / 2 + 20, 450 , 400, 50);
         */
        //Play Button
        if (mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) {
            if(my >= 250 && my <= 300) {
                Window.State = Window.STATE.GAME;
            }
        }

        //Quit Button
        if (mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) {
            if(my >= 450 && my <= 500) {
                System.exit(1);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

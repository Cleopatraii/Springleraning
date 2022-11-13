package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        /**
         *         Rectangle playerbutton =  new Rectangle(Game.WIDTH / 2 + 20, 250, 400,50);
         *         Rectangle computerbutton =  new Rectangle(Game.WIDTH / 2 + 20, 350, 400,50);
         *         Rectangle quitbutton = new Rectangle(Game.WIDTH / 2 + 20, 450 , 400, 50);
         */

        //Host Button
        if (((mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) && Window.State == Window.STATE.MENU2)) {
            if(my >= 250 && my <= 300) {
                Window.State = Window.STATE.GAME;
                return;
            }
        }

        //Play Button
        if ((mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) && Window.State == Window.STATE.MENU) {
            if(my >= 250 && my <= 300) {
                Window.State = Window.STATE.MENU2;
                return;
            }
        }

        //Connect Button
        if ((mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) && Window.State == Window.STATE.MENU2) {
            if(my >= 350 && my <= 400) {
                Window.State = Window.STATE.MENU3;
                return;
            }
        }

        //Quit Button
        if ((mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) && Window.State == Window.STATE.MENU) {
            if(my >= 450 && my <= 500) {
                System.exit(1);
                return;
            }
        }

        //Computer Button
        if ((mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) && Window.State == Window.STATE.MENU) {
            if(my >= 350 && my <= 400) {
                Window.State = Window.STATE.GAME;
                return;
            }
        }


        //Return Button Menu2
        if ((mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) && Window.State == Window.STATE.MENU2) {
            if (my >= 450 && my <= 500) {
                Window.State = Window.STATE.MENU;
                return;
            }
        }

        //Return Button Menu3
        if ((mx >= Window.WIDTH / 2 + 20 && mx <= Window.WIDTH / 2 + 420) && Window.State == Window.STATE.MENU3) {
            if (my >= 450 && my <= 500) {
                Window.State = Window.STATE.MENU2;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

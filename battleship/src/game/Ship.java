package game;

import java.awt.*;

 /* Ship.java
 * Klasse zur Erstellung des Objektes Ship mit Name und Position
 * >mit entsprechenden Attributen, Gettern und Settern
 */

import java.awt.*;

    public class Ship {
        private String name;
        private Point[] position;

        public Point[] getPosition() {
            return position;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPosition(Point[] position) {
            this.position = position;
        }

    }
//Aufrufbeispiel: ships[3].getName


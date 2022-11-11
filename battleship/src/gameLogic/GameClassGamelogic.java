package gameLogic;

/*
  Gamelogic.java
  Klasse als Verbindungsglied zum Programmteil Game-Logik
 */
//TODO Kommentare überarbeiten >>GameLogik
import game.Game;
import game.Ship;

import java.awt.*;

public class GameClassGamelogic {
    //Methode zur Überprüfung Regeln und Weitergabe in Shiparray
    public boolean placeShip(Ship ships){
        //Deklaratio Variablen
        Point[] position=ships.getPosition();
        int[][] fieldarray= Game.getInstance().getPlayerfield();
        int x;
        int y;
        //Regelüberprüfung
        for (Point point : position) {     //Schleife für position
            x = point.x;
            y = point.y;
            for (int fx = -1; fx < 2; fx++) {  //Schleife für x
                for (int fy = -1; fy < 2; fy++) {     //Schleife für y
                    if (fieldarray[y + fy][x + fx] == 1) return false;
                }
            }
        }
        //Position an playerfield übergeben
        for (Point point : position) {
            Game.getInstance().setPlayerfield(point.y, point.x, 1);
        }

        //Position an Ship-Array übergeben
        Ship[] shipArray=Game.getInstance().getShips();
        for (int k = 0; k<shipArray.length; k++){
            if (shipArray[k].getName().equals(ships.getName()))Game.getInstance().changeShip(k,position);
        }

        return true;
    }
    //Methode zu Trefferüberprüfung (return 0>nicht getroffen, 1>getroffen)
    public int opponentTurn(Point position){
        //TODO Methode füllen >>GameLogik
        return 0;//TODO Return-Wert sinnvoll ersetzen >>GameLogik
    }
    //Methode zu ???
    public void ready(){
        //TODO Methode füllen >>GameLogik
    }
    //Methode zur Weitergabe Spielende-Information
    public void end(boolean win){
        //TODO Methode füllen >>GameLogik
    }
}


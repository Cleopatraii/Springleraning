package game;

/**
 * Gamelogic.java
 * Klasse als Verbindungsglied zum Programmteil Game-Logik
 */
//TODO Kommentare überarbeiten >>GameLogik
import java.awt.*;

public class Gamelogic {
    //Methode zur Überprüfung Regeln und Weitergabe in Shiparray
    public boolean placeShip(Ship ships){
        //TODO Methode füllen >>GameLogik
        return true; //TODO Return-Wert sinnvoll ersetzen >>GameLogik
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


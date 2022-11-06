package game;

import network.Network;
import GUI.Window;

/**
 * Game.java
 * Klasse zur Speicherung der Daten des aktuellen Spiels als Singelton
 */

import java.awt.*;

public class Game {
    //Attribut für Singleton
    private static Game instance;
    //weitere Attribute:
    private String  playername;
    private String opponentname;
    private int semester;
    private int[][] playerfield;
    private int[][] oppenentfield;
    private Ship[] ships;
    public Network network;
    public Window view;
    // public Gamelogic gamelogic;

    //Konstruktur und Methode für Singleton:
    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    //Getter:
    public String getPlayername(){
        return playername;
    }

    public String getOpponentname() {
        return opponentname;
    }

    public int getSemester() {
        return semester;
    }

    public int[][] getPlayerfield() {
        return playerfield;
    }

    public int[][] getOppenentfield() {
        return oppenentfield;
    }

    public Ship[] getShips() {
        return ships;
    }

    //Settern:
    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public void setOpponentname(String opponentname) {
        this.opponentname = opponentname;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    //Ein Wert (value) wird an das 2D-Array mit den 1.Index (indexA) und den 2.Index (indexB) übergeben.
    //Folgender Wert bei value möglich:
    //  0->nichts | 1->Schiffsfeld | 2->daneben getroffen | 3-> Schifffeld getroffen | 4-> Schiff versenkt
    public void setPlayerfield(int indexA, int indexB, int value) {
        //Überprüfung Value 0 bis 4
        if (value >=0 && value <5){
            playerfield[indexA][indexB] = value;
        } //Was wenn Fehler?
    }

    //Ein Wert (value) wird an das 2D-Array mit den 1.Index (indexA) und den 2.Index (indexB) übergeben.
    //Folgender Wert bei value möglich:
    //  0->nichts | 1->Schiffsfeld | 2->daneben getroffen | 3-> Schifffeld getroffen | 4-> Schiff versenkt
    public void setOppenentfield(int indexA, int indexB, int value) {
        //Überprüfung Value 0 bis 4
        if (value >=0 && value <5){
            oppenentfield[indexA][indexB] = value;
        } //Was wenn Fehler?
    }

    public void setShips(Ship[] ships) {
        this.ships = ships;
    }

    //Der Positions-Array (position) wird im Schiffsarray an der Index-Stelle (index) geändert.
    public void changeShip(int index, Point[] position){
        ships[index].setPosition(position);
    }

}
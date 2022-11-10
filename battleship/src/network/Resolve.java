package network;

import game.Game;


public class Resolve {
    String readLine;

    public void start(String _readLine) {

        readLine = _readLine;
//        Data.myName=Game.getInstance().getPlayername();
//        Data.myShip = Game.getInstance().getShips();
//        Data.oppoName = Game.getInstance().getOpponentname();

        Data.myStart = true;
    }

    public void startAck(String _readLine) {
//        Data.myName= Game.getInstance().getOpponentname();
//        Data.oppoName=Game.getInstance().getPlayername();

        Data.oppoStart = true;
        if (Data.myStart && Data.oppoStart) {

        }

    }

}

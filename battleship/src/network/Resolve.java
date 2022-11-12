package network;

import game.Game;
import game.Ship;

import java.awt.*;


public class Resolve {

    public static void start(String _readLine) {

//        Data.myName=Game.getInstance().getPlayername();
//        Data.myShip = Game.getInstance().getShips();
//        Data.oppoName = Game.getInstance().getOpponentname();

        Data.myStart = true;
    }

    public static void startAck(String _readLine) {
//        Data.myName= Game.getInstance().getOpponentname();
//        Data.oppoName=Game.getInstance().getPlayername();

        Data.oppoStart = true;
        if (Data.myStart && Data.oppoStart) {

        }

    }

    public static void endAck(String readLine) {
        Game game = Game.getInstance();
        if (game.network.serverSocket == null) {
            String splitMessage[] = messageBuilder.split(readLine);
            //See who won, check if that's true
            if (splitMessage[1].equalsIgnoreCase("host")) {
                int shipCount = 0;
                Ship ships[] = game.getShips();
                int[][] opponentfield = game.getOpponentfield();
                for (Ship i : ships) {
                    shipCount += i.getPosition().length;
                }
                for (int x = 0; x < opponentfield[0].length; x++) {
                    for (int y = 0; y < opponentfield.length; y++) {
                        if (opponentfield[x][y] == 3 || opponentfield[x][y] == 4) {
                            //Hit ship, subtracting from shipCount
                            shipCount--;
                        }
                    }
                }
                if (shipCount != 0) {
                    //still a ship that hasn't been hit remaining
                    game.network.send(messageBuilder.build("ERR", 2, "Game not over yet, still " + shipCount + "ship(s) remaining."));
                    return;
                } else {
                    //TODO: Close connection, show winner on gui
                }
            } else if (splitMessage[1].equalsIgnoreCase("client")) {
                int[][] playerfield = game.getPlayerfield();
                for (int x = 0; x < playerfield[0].length; x++) {
                    for (int y = 0; y < playerfield.length; y++) {
                        if (playerfield[x][y] == 1) {
                            //still a ship that hasn't been hit remaining
                            game.network.send(messageBuilder.build("ERR", 2, "Game not over yet, still a ship at " + x + "," + y));
                            return;
                        }
                    }
                }
                //TODO: Close connection, show winner on gui
            } else {
                //neither host nor client won? Sending error
                game.network.send(messageBuilder.build("ERR", 3, "Expected either host or client, received " + splitMessage[1]));
            }
        } else {
            //received End from Client, send error
            game.network.send(messageBuilder.build("ERR", 2, "Sent End message as client."));
        }
    }

    public static void readyPing(String readLine) {
    }

    public static void readyCheck(String readLine) {
    }

    public static void fire(String readLine) {
        Game game = Game.getInstance();
        String splitMessage[] = messageBuilder.split(readLine);
        if(!splitMessage[1].matches("[0-9]*") || !splitMessage[2].matches("[0-9]*")) {
            //Error, incorrect arguments
        }
        int row = Integer.parseInt(splitMessage[1]);
        int column = Integer.parseInt(splitMessage[1]);
        if (row >= game.getPlayerfield().length || column >= game.getPlayerfield()[0].length) {
            //Error, outside of field range
        }
        int response = game.gamelogic.opponentTurn(new Point(row, column));
        String reply = "";
        switch(response) {
            case 0:
                reply = "MISS";
                break;
            case 1:
                reply = "HIT";
                break;
            case 2:
                reply = "SUNK";
                break;
            default:
                System.out.println("ERROR: Received wrong response from opponentTurn()");
        }
        //TODO: supply optional gameover argument
        game.network.send(messageBuilder.build("FIRE_ACK",reply));
    }

    public static void fireAck(String readLine) {
    }
}

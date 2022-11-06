package game;

import network.Network;

public class Game {
    private static Game instance;

    public String playerName;
    public String opponentName;
    public int Semester;
    public int[][] playerField;
    public int[][] opponentField;

    public Network network;

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
}

import game.Game;
import network.Network;

import java.util.Scanner;

public class main {
    public static void main(String[] argv){
        Game game = Game.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("[h]ost or [c]lient?");
        String input = scanner.next();
        if (input.equals("h")) {
            game.playerName = "host";
            game.Semester = 5;
            game.network = new Network();
        } else if (input.equals("c")) {
            game.playerName = "client";
            game.Semester = 2;
            game.network = new Network("127.0.0.1");
        }
        System.out.println("PlayerName: "+game.playerName);
        System.out.println("OpponentName: "+game.opponentName);
        System.out.println("Semester: "+game.Semester);
        while(true) {
            game.network.send(scanner.nextLine());
        }
    }
}

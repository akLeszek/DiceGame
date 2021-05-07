import players.*;
import statistics.*;

public class PioGame {
    public static void main(String[] args){

        Game game = new Game(new WinStatistics());

//        Statistics stats = new WinStatistics();
//        Game game = new Game(stats);

        game.addPlayer(new PlayerCom("Janusz"));
        game.addPlayer(new PlayerCom("Mariola"));

        game.showPlayers();

        for (int i = 0; i < 100; i++){
            game.play();
        }
        game.printStats();
    }
}
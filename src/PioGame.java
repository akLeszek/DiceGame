import players.PlayerCom;

public class PioGame {
    public static void main(String[] args){

        Game game = new Game();

        game.addPlayer(new PlayerCom("Janusz"));
        game.addPlayer(new PlayerCom("Mariola"));

        game.showPlayers();

        for (int i = 0; i < 100; i++){
            game.play();
        }

        game.printStats();

    }
}
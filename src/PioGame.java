public class PioGame {
    public static void main(String[] args){

        Statistics stats = new Statistics();

//        stats.updateScore("Janusz");
//        stats.updateScore("Janusz");
//        stats.clear();
//        stats.updateScore("Milena");
//        stats.print();
//



        Game game = new Game(new Statistics());

        game.addPlayer(new PlayerCom("Agata"));
        game.addPlayer(new PlayerCom("Agata"));
        game.addPlayer(new PlayerCom("Agata"));
        game.addPlayer(new PlayerCom("Agata"));
        game.addPlayer(new PlayerCom("Agata"));
        game.addPlayer(new PlayerCom("Agata"));
        game.addPlayer(new PlayerCom("Agata"));
        game.addPlayer(new PlayerCom("Agata"));


        game.showPlayers();

        for (int i = 0; i < 100; i++){
            game.play();
        }

        game.printStats();

//
//        try{
//            game.play();
//        } catch (IllegalStateException ex){
//            System.err.println("Błąd: " + ex.getMessage());
//        }
    }
}
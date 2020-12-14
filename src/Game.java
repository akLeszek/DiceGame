import players.Player;
import statistics.NullStatistics;
import statistics.Statistics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.List;


public class Game {

    private Random rand = new Random();
    private List<Player> players = new ArrayList<>();

    private final Statistics stats;

    public Game(){
        this(null);
    }

    public Game(Statistics stats){
        if(stats != null) {
            this.stats = stats;
        } else {
            this.stats = new NullStatistics();
        }
    }

    public void addPlayer(Player player) {
        if (!checkName(player.getName())){
            players.add(player);
        } else {
            uniqueName(player);
        }
    }

    public boolean checkName(String name){
        Iterator<Player> p = players.iterator();
        while (p.hasNext()) {
            if (p.next().getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void uniqueName(Player player){
        player.setName(player.getName() + rand.nextInt(10));
        addPlayer(player);
    }

    public void removePlayer(String name){
        Iterator<Player> p = players.iterator();
        while (p.hasNext()){
            if (p.next().getName().equals(name)){
                p.remove();
            }
        }
    }

    public void showPlayers(){
        System.out.println("-----------------");
        for(Player p : players){
            System.out.println(p.getName());
        }
    }

    public void printStats(){
        System.out.println("################");
        stats.print();
    }

    public void play(){

        int dice, guess;
        boolean attempt;

        if (players.isEmpty()){
            throw new IllegalStateException("Brak graczy");
        }else {
            do {
                System.out.println("---------------------");

                attempt = true;

                dice = rand.nextInt(6)+1;
                System.out.println("Kostka: " + dice);
                System.out.println("---------------------");

                for (Player player : players) {
                    guess = player.guess();
                    System.out.println(player.getName() + ": " + guess);

                    if (dice!=guess) {
                        System.out.println("Próbuj Dalej");
                    }else {
                        attempt = false;
                        stats.updateScore(player.getName());
                        System.out.println("Fajniutko Wygranko");
                    }
                }

            }while(attempt);
        }
        stats.clear();
    }
}

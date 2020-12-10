import java.util.HashMap;

public class Statistics {
    private HashMap<String, Integer> stats = new HashMap();

    public void updateScore(String player){
        int score = stats.getOrDefault(player, 0);
        score += 1;
        stats.put(player, score);
    }

    public void print(){
        stats.forEach((player, score) -> {
            System.out.println(player + ": " + score);
        });
    }

    public void clear(){
        stats.clear();
    }
}
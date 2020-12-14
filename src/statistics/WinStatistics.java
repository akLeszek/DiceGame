package statistics;

import java.util.HashMap;

public class WinStatistics implements Statistics {
    private HashMap<String, Integer> stats = new HashMap();

    @Override
    public void updateScore(String player){
        int score = stats.getOrDefault(player, 0);
        score += 1;
        stats.put(player, score);
    }

    @Override
    public void print(){
        stats.forEach((player, score) -> {
            System.out.println(player + ": " + score);
        });
    }

    @Override
    public void clear(){
        stats.clear();
    }
}
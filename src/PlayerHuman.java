import java.util.Scanner;

public class PlayerHuman extends Player {
    private Scanner cin = new Scanner(System.in);

    public PlayerHuman(){}

    public PlayerHuman(String name){
        super(name);
    }

    @Override
    public int guess() {
        return cin.nextInt();
    }
}
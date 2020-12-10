import java.util.Random;

public class PlayerCom  extends Player{
    Random brain = new Random();

    public PlayerCom() {}

    public PlayerCom(String name){
        super(name);
    }


    public int guess(){
        return brain.nextInt(6) + 1;
    }
}

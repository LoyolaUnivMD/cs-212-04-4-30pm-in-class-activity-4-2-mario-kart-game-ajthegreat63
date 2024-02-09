// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

public class MarioKartPlayer{

    private final String playerName;
    private final String character;
    private int speed;

    public MarioKartPlayer(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public void boost(){
        speed += 10;
        System.out.println("Woah, " + character + " just sped up to " + speed + " mph!");
        speed -= 10;
    }

    public void displayInfo(){
        System.out.println("Player name: [" + playerName + "] Character: [" + character + "] Current speed: [" + speed + "]");
    }
}

class MarioKartGame{
    public static void main (String [] args){
        MarioKartPlayer mario = new MarioKartPlayer("AJ", "Tanooki Mario", 30);
        MarioKartPlayer donkeyKong = new MarioKartPlayer("Miguel", "Donkey Kong", 25);

        mario.displayInfo();
        donkeyKong.displayInfo();

        mario.boost();
        donkeyKong.boost();
    }
}

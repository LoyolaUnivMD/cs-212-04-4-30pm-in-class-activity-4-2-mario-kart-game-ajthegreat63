
// This class represents a player in the Mario Kart game.
public class MarioKartPlayer{

    // Attributes of a player
    private final String playerName; // Player's name
    private final String character; // Player's character
    private int speed; // Player's current speed

    // Constructor to initialize a MarioKartPlayer object
    public MarioKartPlayer(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    //Method to simulate a speed boost for the player.
    public void boost(){
        // Increase speed temporarily by 10 mph
        speed += 10;
        // Display a message indicating the boost
        System.out.println("Woah, " + character + " just sped up to " + speed + " mph!");
        // Decrease speed back to the original value after the boost
        speed -= 10;
    }

    //Method to display the player's information.
    public void displayInfo(){
        // Display player's name, chosen character, and current speed
        System.out.println("Player name: [" + playerName + "] Character: [" + character + "] Current speed: [" + speed + "]");
    }
}

//This class represents the main game logic for Mario Kart.
class MarioKartGame{
    public static void main (String [] args){
        // Create two MarioKartPlayer objects
        MarioKartPlayer mario = new MarioKartPlayer("AJ", "Tanooki Mario", 30);
        MarioKartPlayer donkeyKong = new MarioKartPlayer("Miguel", "Donkey Kong", 25);

        // Display initial information for both players
        mario.displayInfo();
        donkeyKong.displayInfo();

        // Simulate a boost for both players
        mario.boost();
        donkeyKong.boost();
    }
}


import java.util.Random;
public class randomnum {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100, 150);
        System.out.println("Random Number: " + randomNumber);



    }
    
}

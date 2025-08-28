import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total =0;

        System.out.println("🎲 Welcome to the Dice Roller! 🎲");
        System.out.println("Enter the number of dice to roll");
        numOfDice = scanner.nextInt();

        if(numOfDice>0){
            System.out.println("Rolling "+ numOfDice + " dice...");
            for(int i =0;i<numOfDice;i++){
                int roll = random.nextInt(1,7);
                System.out.println("You rolled "+ roll);
                total += roll;
                System.out.println("Your total is: " + total);
            }
        }
        else{
            System.out.println("Dice rolled should be greater than zero");
        }


    }
}

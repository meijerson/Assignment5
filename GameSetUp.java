import java.util.Scanner;
/**
 * Write a description of class GameSetUp here.
 * 
 * @author Mackenzie Bloswick
 * @version 3/15/2017
 */
public class GameSetUp
{
    int[] dice;
    int amountOfSides;
    int amountOfDice;
    int targetNumber;
    
    public GameSetUp(int amountOfSides, int amountOfDice, int targetNumber)
    {
        setValidAmountOfSides(amountOfSides);
        setValidAmountOfDice(amountOfDice);
        setValidTargetNumber(targetNumber);
    }
    
    public void setValidAmountOfSides(int newAmountOfSides) {
        Scanner scan = new Scanner(System.in);
        amountOfSides = newAmountOfSides;
        while (amountOfSides != 4 && amountOfSides != 6 && amountOfSides != 8
        & amountOfSides != 10 && amountOfSides != 12 && amountOfSides != 20
        && amountOfSides != 100) {
            System.out.println("Please enter a correct amount of sides (4,6,8,10,12,20,100): ");
            amountOfSides = scan.nextInt();
        }
        System.out.println("Number of sides accepted.");
    }
    
    public void setValidAmountOfDice(int newAmountOfDice) {
        Scanner scan = new Scanner(System.in);
        amountOfDice = newAmountOfDice;
        while (amountOfDice < 1 || amountOfDice > 10) {
            System.out.println("Please enter a correct amount of dice (1-10): ");
            amountOfDice = scan.nextInt();
        }
        System.out.println("Number of dice accepted.");
    }
    
    public void setValidTargetNumber(int newTargetNumber) {
        Scanner scan = new Scanner(System.in);
        targetNumber = newTargetNumber;
        int targetMin = amountOfSides;
        int targetMax = amountOfSides * amountOfDice;
        while (targetNumber < targetMin || targetNumber > targetMax) {
            System.out.println("Please enter a target number between " + targetMin + " and " + targetMax + ".");
            targetNumber = scan.nextInt();
        }
        System.out.println("Target number accepted.");
    }
    
    public int getAmountOfSides() {
        return amountOfSides;
    }
    
    public int getAmountOfDice() {
        return amountOfDice;
    }
    
    public int getTargetNumber() {
        return targetNumber;
    }
}
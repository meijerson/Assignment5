import java.util.Random;
/**
 * Write a description of class Game here.
 * 
 * @author Mackenzie Bloswick
 * @version 03/15/2017
 */
public class GameManager
{
    private int[] dice;
    private GameSetUp myGame;
    int diceTotaled;
    
    public GameManager(int amountOfSides, int amountOfDice, int targetNumber)
    {
        myGame = new GameSetUp(amountOfSides, amountOfDice, targetNumber);
        dice = new int[myGame.getAmountOfDice()];
    }
    
    public void playGame() {
        rollDice(myGame.getAmountOfSides());
        if (GameRules.checkIfBust(dice)) {
          //  printBust();
        }else {
            printRolls();
            printDiceTotaled();
            if (GameRules.checkIfUserWon(diceTotaled, myGame.targetNumber)) {
                printWin();
            }else {
                printLose();
            }
        }
    }
    
    public void rollDice(int amountOfSides)
    {
        Random rand = new Random();
        diceTotaled = 0;
        for (int i = 0; i < dice.length; i++)
        {
            dice[i] = rand.nextInt(amountOfSides) + 1;
            diceTotaled = diceTotaled + dice[i];
            if (GameRules.checkIfSizeEqualsRoll(amountOfSides, dice[i])) {
                i--;
            }
        }
    }
    
    public void printBust()
    {
        System.out.println("Bust! Over 50% of your rolls were 1s.");
    }
    
    public void printRolls()
    {
        System.out.println("Your rolls: ");
        for (int i = 0; i < dice.length; i++) {
            System.out.println(dice[i]);
        }
    }
    
    public void printDiceTotaled() {
        System.out.println("The total of your dice is " + diceTotaled + "!");
    }
    
    public void printWin() {
        System.out.println("You've reached your target number! You win!");
    }
    
    public void printLose() {
        System.out.println("You did not reach your target number! You lose!");
    }
}
    


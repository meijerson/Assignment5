/**
 * Write a description of class GameRules here.
 * 
 * @author Mackenzie Bloswick
 * @version 3/15/2017
 */
public class GameRules
{
    public static boolean checkIfBust(int[] dice) {
        int areOnes = 0;
        int areNotOnes = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                areOnes++;
            }
            else {
                areNotOnes++;
            }
        }
        if (areOnes > areNotOnes) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfSizeEqualsRoll(int amountOfSides, int roll) {
        if (amountOfSides == roll) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfUserWon(int diceTotaled, int targetNumber) {
        if (diceTotaled >= targetNumber) {
            return true;
        }
        else {
            return false;
        }
    }
}

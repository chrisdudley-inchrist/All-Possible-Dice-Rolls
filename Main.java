import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int n = 3;
        for (int[] array : allPossibleDiceRolls(n)) {
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

        }
    }

    public static int[][] allPossibleDiceRolls(int numRolls) {
        List<List<Integer>> allSolutions = new LinkedList<>();
        for (int i = 1; i <= 6; i++) {
            List<Integer> rollArray = new LinkedList<>();
            allPossibleDiceRollsHelper(numRolls, rollArray, allSolutions);
        }
        return null;
    }

    public static void allPossibleDiceRollsHelper(int rollsRemaining, List<Integer> arr, List<List<Integer>> allSolutions) {


        if (rollsRemaining == 0) {
            List<Integer> arrayAdd = new ArrayList<>();
            arrayAdd.addAll(arr);
            allSolutions.add(arrayAdd);
        } else {
            for (int i = 1; i <= 6; i++) {
                arr.add(i);
                allPossibleDiceRollsHelper(rollsRemaining - 1, arr, allSolutions);

                arr.remove(arr.size()-1);
            }
        }
    }
}
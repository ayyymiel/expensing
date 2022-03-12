import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

// TODO: should look like this

// Date
// Expense 1: Running Total #####
// Expense 2: Running Total #####
// Expense n.....
// Most recent purchase

// TODO: set up JSON communication

public class home {

    public static float spendGainCalc() {
        Scanner inputAction = new Scanner(System.in);
        Scanner inputExpenseType = new Scanner(System.in);
        Scanner inputValueSpent = new Scanner(System.in);

        parser.readJSON();

        System.out.print("Expense Selection (Number) or Income (0): ");
        int action;
        action = inputAction.nextInt();
        return 0;
    }

    public static void main(String[] args) {
        // main menu
        Scanner inputSelection = new Scanner(System.in);

        System.out.println("========== Running Total =========");
        System.out.println("Money?: ");

        System.out.println(spendGainCalc());
    }
}

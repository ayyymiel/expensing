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
        Scanner inputExpenseType = new Scanner(System.in);
        Scanner inputValueSpent = new Scanner(System.in);

        System.out.print("Expense Selection (Number): ");
        int inputType;
        inputType = inputExpenseType.nextInt();

        System.out.print("Input Money Gained (+) or Spent (-): ");
        float inputMoneys;
        inputMoneys = inputValueSpent.nextFloat();


    }

    public static List<String> expenseList() {
        // add new item to list
        Scanner inputNew = new Scanner(System.in);
        System.out.println("Please enter a new Expense Type: ");
        String newExpense;
        newExpense = inputNew.nextLine();

        List<String> menuExpense = new ArrayList<>();
        menuExpense.add(newExpense);

        return menuExpense;
    }

    public static void main(String[] args) {
        // main menu
        Scanner inputSelection = new Scanner(System.in);

        System.out.println("========== Running Total =========");
        System.out.println("Please make a selection: ");

        List<String> menuList = new ArrayList<>();
        menuList.add("1. Select Expense");
        menuList.add("2. Add New Expense Type");
        System.out.println(menuList);

        System.out.println("Make a selection (1 or 2): ");
        float selection;
        selection = inputSelection.nextInt();

        if (selection == 1) {
            System.out.println(spendGainCalc());
        } else {
            System.out.println(expenseList());
        }
    }
}

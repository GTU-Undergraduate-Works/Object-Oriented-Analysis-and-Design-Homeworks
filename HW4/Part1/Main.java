package duraklefkan.gtu.cse443.hw4.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class to test finite state machine.
 */
public class Main {

    /**
     * main method to test program
     * @param args argument list
     */
    public static void main(String[] args) {

        System.out.println("WELCOME TO FINITE STATE MACHINE");
        FiniteStateMachine finiteStateMachine = new FiniteStateMachine();


        boolean flag = true;

        try {
            while (flag) {

                System.out.println("You are currently in " + finiteStateMachine.getCurrentState() + ".");
                System.out.println("Choose one operation from the following menu.");
                printTransitionMenu();
                Scanner scanner = new Scanner(System.in);
                int choose = scanner.nextInt();

                switch (choose) {
                    case 1: finiteStateMachine.exercise(); break;
                    case 2: finiteStateMachine.perseveranceAndHardWork(); break;
                    case 3: finiteStateMachine.sleep(); break;
                    case 4: finiteStateMachine.outTillLate(); break;
                    case 5: finiteStateMachine.coffeeAndWork(); break;
                    case 6: finiteStateMachine.cheating(); break;
                    case 7: finiteStateMachine.buyingGPU(); break;
                    case 8: System.out.println("Program is closing"); flag = false; break;
                    default: System.out.println("You made wrong choice. Please try again");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You pressed non-integer key. Program is closing");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Prints menu on screen
     */
    private static void printTransitionMenu() {

        System.out.println("1 - Doing Exercise");
        System.out.println("2 - Perseverance and Hard Working");
        System.out.println("3 - Sleeping");
        System.out.println("4 - Out till late");
        System.out.println("5 - Drinking coffee and working");
        System.out.println("6 - Cheating");
        System.out.println("7 - Buying GPU");
        System.out.println("8 - Exit");
    }



}

package duraklefkan.gtu.cse443.hw2.question2;

import java.util.Scanner;

/**
 * This class tests Zirhsan Suit Design Program.
 * Software is designed using Decorator-Design-Pattern.
 */
public class Demo {

    /**
     * main method to test program.
     * @param args main arguments
     */
    public static void main(String[] args) {

        System.out.println("WELCOME TO ZIRHSAN MILITARY SUIT DESIGN PROGRAM");
        System.out.println("Select Basic Suit From Below Menu");
        System.out.println("Press 1 for DEC Suit");
        System.out.println("Press 2 for ORA Suit");
        System.out.println("Press 3 for TOR Suit");
        System.out.println("Press 5 to exit from program");
        int number;
        Suit suit = null;
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        try {
            while (!flag) {
                number = Integer.parseInt(input.nextLine());
                switch (number) {
                    case 1:
                        suit = new DecSuit();
                        flag = true;
                        break;
                    case 2:
                        suit = new OraSuit();
                        flag = true;
                        break;
                    case 3:
                        suit = new TorSuit();
                        flag = true;
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice!");
                        System.out.println("Choose Again: ");
                        break;
                }
            }
            System.out.println("Your suit : " + suit.getDescription());
            System.out.println("Total cost of your suit : " + suit.cost());
            System.out.println("Total weight of your suit : " + suit.weight());
            while (true) {

                System.out.println("\nDECORATE YOUR SUIT WITH FOLLOWING ACCESORIES");
                System.out.println("Press 1 to add Flamethrower to your suit");
                System.out.println("Press 2 to add AutoRifle to your suit");
                System.out.println("Press 3 to add RocketLauncher to your suit");
                System.out.println("Press 4 to add Laser to your suit");
                System.out.println("Press 5 to exit from program");
                number = Integer.parseInt(input.nextLine());
                switch (number) {
                    case 1:
                        suit = new Flamethrower(suit);
                        break;
                    case 2:
                        suit = new AutoRifle(suit);
                        break;
                    case 3:
                        suit = new RocketLauncher(suit);
                        break;
                    case 4:
                        suit = new Laser(suit);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice!");
                        System.out.println("Choose Again: ");
                        break;
                }
                System.out.println("Your suit : " + suit.getDescription());
                System.out.println("Total cost of your suit : " + suit.cost());
                System.out.println("Total weight of your suit : " + suit.weight());
            }
        } catch (NumberFormatException e) {
            System.out.println("Input is not a number");
            System.exit(1);
        }
    }
}

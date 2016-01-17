
import java.util.Random;
import java.util.Scanner;
 
public class Craps {
 
    public static void main(String args[]) {
        System.out.print("How much money do you have totally? $");
        Scanner keyboard4 = new Scanner(System.in);
        double total = keyboard4.nextDouble();
                 
        boolean stop = false;
        while (stop == false) {
            int n = 0; //simple counter
            System.out.print("Place your bets! $");
            Scanner keyboard = new Scanner(System.in);
            double bet = keyboard.nextDouble();
            double bet1 = 0; //bet after odds
            Random generator = new Random();
            int dies = generator.nextInt(6) + 1;
            int dies2 = generator.nextInt(6) + 1;
            int dietotal = dies + dies2;
            System.out.println("Press 'Enter' to roll");
            Scanner keyboard3 = new Scanner(System.in);
            String q2 = keyboard3.nextLine();
            System.out.println("Your first roll was " + dietotal);
            if (dietotal == 7||dietotal==11) {
                System.out.println("You win!");
                System.out.println("Amount won: $" + bet);
                total = total + bet;
                System.out.println("Your new total is: " + total);
                System.out.print("\nDo you want to play again?(If yes,press'y'): ");
                Scanner keyboard2 = new Scanner(System.in);
                String cont = keyboard2.nextLine();
                if ( cont.equals("y")) {
                    stop = false; 
                } else {
                    stop = true;
                }
            } else if (dietotal == 2 || dietotal == 3 || dietotal == 12) {
                System.out.println("You Crapped out!");
                System.out.println("Amount lost: $" + bet);
                total = total - bet;
                System.out.println("Your new total is: " + total);
                System.out.print("\nDo you want to play again?(If yes,press'y'): ");
                Scanner keyboard2 = new Scanner(System.in);
                String cont = keyboard2.nextLine();
                if ( cont.equals("y") ) {
                    stop = false;
                } else {
                    stop = true;
                }
            } else {
                if (dietotal == 4 || dietotal ==5||dietotal==6||dietotal==8||dietotal==9||dietotal==10) {
                    bet1 = bet;
                }
                int TotalDiet = 0;
                while (!(TotalDiet == 7 || TotalDiet == dietotal)) {
                    int die = generator.nextInt(6) + 1;
                    int die2 = generator.nextInt(6) + 1;
                    TotalDiet = die + die2;
                    n = n + 1;
                    System.out.println("Press 'Enter' to roll again");
                    Scanner keyboard2 = new Scanner(System.in);
                    String q = keyboard2.nextLine();
                    System.out.println("Roll " + n + ": " + TotalDiet);
                }
                if (TotalDiet == 7) {
                    System.out.println("You lose");
                    System.out.println("You lost your bet of: $" + bet);
                    total = total - bet;
                }
                if (TotalDiet == dietotal) {
                    System.out.println("You win!");
                    System.out.println("Amount won: $" + bet1);
                    total = total + bet1;
                }
                System.out.println("Your Ending Balance is: " + total);
 
                System.out.print("\nDo you want to play again?(If yes,press'y'): ");
                Scanner keyboard2 = new Scanner(System.in);
                String cont = keyboard2.nextLine();
                if ( cont.equals("y")) {
                    stop = false;
                } else {
                    stop = true;
                }
            }
        }
    }
}

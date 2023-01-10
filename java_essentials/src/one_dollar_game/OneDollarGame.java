package one_dollar_game;



import java.util.Scanner;

public class OneDollarGame {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies do you have?");
        int pennies = scanner.nextInt();

        System.out.println("How many nickels do you have?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes do you have?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters do you have?");
        int quarters = scanner.nextInt();

        scanner.close();

        double total = (pennies)+(nickels*5)+(dimes*10)+(quarters*25);

        if(total == 100){
            System.out.println("You won!");
        }else{
            System.out.println("You lose!");
        }


    }

}

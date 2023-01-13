package instant_credit_checker;

import java.util.Scanner;

public class InstantCreditChecker {


    public static void main(String args[]){

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(actualCreditScore, actualSalary);

        notifyUser(qualified);
    }

    public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(creditScore >= requiredCreditScore && salary >= requiredSalary){

            return true;
        }
        else{

            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've benn approved.");
        }
        else{
            System.out.println("Sorry. You've been declined.");
        }
    }



}

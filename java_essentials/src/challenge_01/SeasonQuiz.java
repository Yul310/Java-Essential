package challenge_01;

import java.util.Scanner;

public class SeasonQuiz {

    public static void main(String[] args){

        //1.Get the number of hours worked
        String season = "winter";
        System.out.println("what is current season?");
        Scanner scanner = new Scanner(System.in);
        season = scanner.next();

        //2.Get the hourly pay rate
        int num = 0;
        System.out.println("How many cups of coffee do you drink typically in this season?");
        num = scanner.nextInt();


        //3.Multiply hours and pay rate
        String adjective= "cold";
        System.out.println("Please describe the current season's weather with one adjective word.");
        adjective = scanner.next();

        scanner.close();

        //4.Display result
        System.out.println("On a "+ adjective +" "+ season +" day, I drink a minimum of "+ num +" cups of coffee.");

    }






}

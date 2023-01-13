package rollTheDie_game;

import java.util.Random;
import java.util.Scanner;

public class rollTheDieGame {

    public static void main(String[] arg){

        int leftnum = 20;
        int leftroll = 5;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i<6; i++){
            System.out.println("Do you want to roll the dice? This is going to be your turn " + i + ". Press Y key to proceed.");

            String answer = scanner.next();


            if(answer.equals("Y") || answer.equals("y")){
                Random random = new Random();
                int die = random.nextInt(6) + 1;

                System.out.println("die is "+ die );
                total += die;
                leftnum -= die;
                leftroll -= 1;

                if(total > 20){
                    System.out.println(" 20 exceeded. you lose! " );
                    break;
                }
            }
            if(leftroll != 0) {
                System.out.println(String.format(" %d turns left: you are %d away.", leftroll, leftnum));
            }
        }
        scanner.close();

        if(total > 20 || total < 20){
            System.out.println(" you lose! " );

        }
        else if(total == 20){
            System.out.println(" you won! " );
        }

    }



}

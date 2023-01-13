package rollTheDie_game;

import java.util.Random;
import java.util.Scanner;

public class rollTheDieGame {

    public static void main(String[] arg){

        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i<6; i++){
            System.out.println("Do you want to roll the dice? This is your turn " + i + ". Press Y key to proceed.");

            String answer = scanner.next();


            if(answer.equals("Y") || answer.equals("y")){
                Random random = new Random();
                int die = random.nextInt(6) + 1;

                System.out.println("die is "+ die );
                total += die;
                if(total > 20){
                    System.out.println(" 20 exceeded. you lose! " );
                    break;
                }
            }

            System.out.println("you still have "+(5-i)+" turns and you are "+(20-total)+" away." );
        }
        scanner.close();

        if(total < 20){
            System.out.println(" 20 exceeded. you lose! " );

        }
        else if(total == 20){
            System.out.println(" you won! " );
        }

    }



}

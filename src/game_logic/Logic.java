package game_logic;

import generate_random.Random;
import java.util.Scanner;

public class Logic {
  //scanner and random object declaration
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();
  
  public void Game(int max, int attemps){
      System.out.println(Messages.Start.START_EASY);
      int rand = random.Random_fun(max); //variable containing the number generated by the function
  
      for (int i = 0; i < attemps; i++){ 
  
        System.out.println("Guess the generated number:");
        int num = scanner.nextInt(); //input
  
        if(num == rand){
          System.out.println(Messages.Advice.CORRECT);
          System.out.println(Messages.End.GAME_COMPLETE);
          break;
        } 
        else if(num > rand) {
          System.out.println(Messages.Advice.TOO_HIGH);
          if(i == attemps-1) System.out.println(Messages.End.LOST);
        }
        else {
          System.out.println(Messages.Advice.TOO_LOW);
          if(i == attemps-1) System.out.println(Messages.End.LOST);
        }
    }
  }
}
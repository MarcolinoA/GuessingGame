package menu;
import java.util.Scanner;

import game_selection.Easy;
import generate_random.Random;

public class menu implements Easy, Random{
  Scanner scanner = new Scanner(System.in);

  @Override
  public int easy_random(){

  }

  @Override
  public int intermediate_random(){

  }

  @Override
  public int advanced_random(){

  }


  @Override 
  public void inputNum(String Advice, int max, Random easy_random){
    System.out.println(Messages.Start.START_EASY);
    max = 20;
    Random generator = new Random();

    for (int i = 0; i < max; i++){
      System.out.println("Guess the generated number");
      int num = scanner.nextInt();
      //int ran = generator.easy_random();
      if(true){

      }
    }
  }

  public void welcome(){
    System.out.println("welcome, choose the level of difficulty you want to use: ");
    System.out.println("1: Easy / 2: Intermediate / 3: Advanced");
    int choose = scanner.nextInt();
    switch (choose) {
      case 1:
          //devo richiamare il metodo easy all'interno di questa classe per far si che dopo la scelta del livello di difficolta inizi il gioco
      case 2:
          //"Intermediate"
      case 3:
          //"Advanced"
        break;
    
      default:
        break;
    }

  }
}

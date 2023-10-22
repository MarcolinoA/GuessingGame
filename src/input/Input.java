package input;

import java.util.Scanner;

import game_selection.Easy;

public class Input {
  Scanner scanner = new Scanner(System.in);

  public void welcome(){
    System.out.println("welcome, choose the level of difficulty you want to use: ");
    System.out.println("1: Easy / 2: Intermediate / 3: Advanced");
    int choose = scanner.nextInt();
    switch (choose) {
      case 1:
          //devo richiamare il metodo easy all'interno di questa classe per far si che dopo la scelta del livello di difficolta inizi il gioco
      case 2:
          "Intermediate"
      case 3:
          "Advanced"
        break;
    
      default:
        break;
    }

  }

  public void enter_your_number(){
    System.out.println("Enter your number! ");
    int input_number = scanner.nextInt();
  }
}

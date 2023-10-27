package menu;

import java.util.Scanner;

import game_logic.Logic;

public class Menu{
  Scanner scanner = new Scanner(System.in);
  Logic logic = new Logic();

  public void Welcome(){
    int choose;
    do{
      System.out.println("welcome, choose the level of difficulty you want to use: ");
      System.out.println("1: Easy / 2: Intermediate / 3: Advanced");

      while(!scanner.hasNextInt()){
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
      }
      choose = scanner.nextInt();
    }while(choose < 1 || choose > 3);

    
    switch (choose) {
      case 1:
        logic.Game(20, 5);
        break;
      case 2:
        logic.Game(50, 8);
        break;
      case 3:
        logic.Game(100, 10);
        break;
    
      default:
        System.out.println("Invalid choice. Please select a valid option.");
        break;
    }  
  }
}

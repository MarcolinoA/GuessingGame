package menu;

import java.util.Scanner;

import game_logic.Logic;

public class Menu{
  Scanner scanner = new Scanner(System.in);
  Logic logic = new Logic();

  public void Welcome(){
      System.out.println("welcome, choose the level of difficulty you want to use: ");
      System.out.println("1: Easy / 2: Intermediate / 3: Advanced");

      int choose = scanner.nextInt();

      switch (choose) {
        case 1:
          logic.Game(20, 5);
        case 2:
          logic.Game(50, 8);
        case 3:
          logic.Game(100, 10);
        break;
    
      default:
        break;
      }
  }
}

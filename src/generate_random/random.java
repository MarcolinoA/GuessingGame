package generate_random;
//in this file is a function that generates a random number within a range of numbers set by the developer

public class Random {
  public int Random_fun(int max) {
    int min = 0;
    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    System.out.println(random_int);
    
    return random_int;
  }
}

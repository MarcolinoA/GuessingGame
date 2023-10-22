package generate_random;

public class random {
  public void easy_random () {
    final int min = 0;
    final int max = 20;

    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    System.out.println(random_int);
  }

  public void intermediate_random(){
    final int min = 0;
    final int max = 50;

    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    System.out.println(random_int);
  }

  public void advanced_random(){
    final int min = 0;
    final int max = 100;

    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    System.out.println(random_int);
  }
}

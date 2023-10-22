package generate_random;

public interface Random {
  public interface Rand_Fun {
    public int easy_random();
    public int intermediate_random();
    public void advanced_random();
  }
}

/*
public class Random {
  public int easy_random() {
    final int min = 0;
    final int max = 20;

    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    
    return random_int;
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
*/
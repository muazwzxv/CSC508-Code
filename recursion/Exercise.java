

public class Exercise {

  public static void main(String [] args) {
    // div and mod
    recursive(2849);
  }

  static void recursive(int num) {
    if (num / 10 == 0) return;

    System.out.println( num + " mod by 10 = " + num % 10);
    System.out.println( num + " divide by 10 = " + num / 10);
    
    // Recursive
    recursive(num/10);

    System.out.println("muaz kacak");
  }
}

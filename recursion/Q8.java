

public class Q8 {

  public static void main(String [] args) {
   //int hehe = kira(5); 
   int hehe = kiraIterative(5);
   System.out.println(hehe);
  }

  public static int kira(int p) {
    if (p <= 0) return 0;

    return (2*(p-1)) + kira(p-1);
  }

  public static int kiraIterative(int p) {
    int data = 0;
    for (int i = 0; i < p; i++) {
      data += (2*((p - i) - 1));
    }
    return data;
  }
}

/**
 * int kirakira(int p)
 * Base case (p <= 0)
 * final = 21
 * (2*(5-1)) | 8 + kirakira(4) | 13
 * (2*(4-1)) | 6 + kirakira(3) | 6
 * (2*(3-1)) | 4 + kirakira(2) | 2
   (2*(2-1)) | 2 + kirakira(1) | 0
   (2*(1-1)) | 0 + (kirakira(0) | 0)
 */

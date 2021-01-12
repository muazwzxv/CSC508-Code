

public class Q9 {
  public static void main(String[] args) {

    int hehe = calc(5, 3);
    System.out.println(hehe);
  }

  static int calc(int n, int k) {
    if ( n < k && k < 1 ) return 0;
    if (n == k) return 1;
    if (k == 1) return n;

    return calc(n-1, k-1) + calc(n-1, k);
  }
}



/**
 *
 * calc(n, k)
 * calc(5, 3)
 * (n > k && k > 3)
 *
 * calc(4, 2) + calc(4, 3)
 *
 * (4, 2)
 * calc(3, 1) + calc()
 *
 * (4, 3)
 * calc(3, 2) + calc(3, 3)
 *
 */

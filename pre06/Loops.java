//exercise 3
public class Loops {
  public static void main(String[] args) {
    double x = 2;
    int n = 4;
    double result = power(x, n);

    System.out.println(result); 
    
    // result should be 16
}
    public static double power(double x, int n) {
    // if x == 2 and n == 4
    // 2 * 2 * 2 * 2 = 2 ^ 4
      double result = 1;
      for (int i = 0; i < n; i++) {
        result = result * x;
      // 1 * 2
      // 2 * 2
      // 4 * 2
      // 8 * 2
    }
    // 16
        return result;
  }
}


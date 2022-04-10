import java.util.*;
public class Triangle {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input side1: ");
  int a = in .nextInt();
  System.out.print("Input side2: ");
  int b = in .nextInt();
  System.out.print("Input side3: ");
  int c = in .nextInt();

  System.out.print("These sides form a triangle: " + isTriangle(a, b, c));
 }
 public static boolean isTriangle(int a, int b, int c) {
  return (a + b > c && b + c > a && c + a > b);
 }
}

package exception_handling;

public class DemoExcHandling {

  public static void main(String[] args) {
    int m = 10;
    int n = 0;
    try {
      int ans = m / n;
      System.out.println(ans);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
  }

}

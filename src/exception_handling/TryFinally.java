package exception_handling;

public class TryFinally {

  public static void main(String[] args) {
    System.out.println("Connection opening");
    try {
      System.out.println(10 / 0);
    } finally {
      System.out.println("Connection closing");
    }
  }

}
//Output:
/*
Connection opening
  Connection closing
  Exception in thread "main" java.lang.ArithmeticException: / by zero
    at exception_handling.TryFinally.main(TryFinally.java:8)*/

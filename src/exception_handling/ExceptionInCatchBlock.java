package exception_handling;

public class ExceptionInCatchBlock {

  public static void main(String[] args) {
    try {
      System.out.println(10 / 0); // Exception error
    } catch (ArithmeticException ae) {
      System.out.println("Exception in: " + ae);
      System.out.println("Mumin".charAt(13)); //It will show exception: ArrayIndexOutOfBound
    } finally {
      System.out.println("Final block");
    }
  }

}

// Output

package exception_handling;

public class ExceptionInTryCatchFinallyBlocks {

  public static void main(String[] args) {
    try {
      System.out.println(15 / 0); //Exception occur
    } catch (Exception e) {
      System.out.println("Mumin".charAt(10)); // Exception occurs
    } finally {
      System.out.println("Pervez".charAt(10)); // Exception occurs
    }
  }

}

package exception_handling;

public class FinallyExample {

  public static void main(String[] args) {
    int[] rollNo = {1, 2, 5, 8, 9};
    try {
      System.out.println(rollNo[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught: " + e);
    } finally {
      System.out.println("Final block always executes");
    }
    System.out.println("Program continues");
  }

}

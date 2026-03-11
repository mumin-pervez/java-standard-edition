package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the division value: ");
    try {
      int divValue = scanner.nextInt(); // For input type mismatch
      System.out.println(15 / divValue); // For arithmetic exception
    } catch (InputMismatchException ie) {
      System.out.println("Exception: " + ie);
    } catch (ArithmeticException ae) {
      System.out.println("Exception: " + ae);
    }
    System.out.println("Rest of the code");
  }

}

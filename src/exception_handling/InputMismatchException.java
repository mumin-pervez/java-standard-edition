package exception_handling;

import java.util.Scanner;

public class InputMismatchException {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the division value: ");
    try {
      int divValue = input.nextInt();
      System.out.println(10 / divValue);
    } catch (java.util.InputMismatchException ie) {
      System.out.println("Exception: " + ie);
    }

  }

}

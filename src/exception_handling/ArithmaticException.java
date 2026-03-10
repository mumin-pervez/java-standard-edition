package exception_handling;

import java.util.Scanner;

public class ArithmaticException {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter division value: ");
    int divValue = input.nextInt();
    try {
      int divResult = 10 / divValue;
      System.out.println(divResult);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }

  }
}

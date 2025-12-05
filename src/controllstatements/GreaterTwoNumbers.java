package controllstatements;

import java.util.Scanner;

public class GreaterTwoNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Input second number: ");
    int num2 = scanner.nextInt();
    System.out.println("First No: " + num1 + " Second No: " + num2);

    if (num1 > num2) {
      System.out.println(num1 + " is greater than " + num2);
    } else {
      System.out.println(num2 + " is greater than " + num1);
    }
  }
}

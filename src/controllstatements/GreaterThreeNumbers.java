package controllstatements;

import java.util.Scanner;

public class GreaterThreeNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter 1st Number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter 2nd Number: ");
    int num2 = scanner.nextInt();
    System.out.print("Enter 3rd Number: ");
    int num3 = scanner.nextInt();
    if (num1 > num2) {
      if (num1 > num3) {
        System.out.println("Number-1: " + num1 + " is Greater");
      } else {
        System.out.println("Number-3: " + num3 + " is Greater");
      }
    } else if (num2 > num3) {
      System.out.println("Number-2: " + num2 + " is Greater");
    }

  }

}

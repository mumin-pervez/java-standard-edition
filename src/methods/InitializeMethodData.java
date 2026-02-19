package methods;

import java.util.Scanner;

public class InitializeMethodData {

  static void add(int a, int b) {
    System.out.println(a + b);
  }

  public static void main(String[] args) {
    InitializeMethodData obj = new InitializeMethodData();
    InitializeMethodData.add(10, 25);
    //2nd way
    int a = 30;
    int b = 15;
    InitializeMethodData.add(a, b);
    //3rd way
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();
    System.out.println("3rd way to initialize method data");
    InitializeMethodData.add(num1, num2);
  }

}

package controllstatements;

import java.util.Scanner;

public class NextVsNextLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your first name : ");
    String next = scanner.next();
    System.out.println(next);

    Scanner nl = new Scanner(System.in);
    System.out.println("Enter your last name : ");
    String nextLine = nl.nextLine();
    System.out.println(nextLine);
  }

}

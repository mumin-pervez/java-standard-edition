package methods;

public class VarArgAddMethod {

  public static void add(int... x) {
    int total = 0;
    for (int x1 : x) {
      total = total + x1;
    }
    System.out.println("Sum: " + total);
  }

  public static void main(String[] args) {
    add(10);
    add(10, 20);
    add(10, 20, 30);
  }

}

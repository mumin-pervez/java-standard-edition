package exception_handling;

public class TestEH {

  public static void main(String[] args) {
    try {
      System.out.println("Mumin");
      System.out.println("Pervez");
      System.out.println(10/0);
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
    System.out.println("Rest of the application");
  }

}

/*
Output:
    Mumin
    Pervez
    Exception: java.lang.ArithmeticException: / by zero
    Rest of the application*/

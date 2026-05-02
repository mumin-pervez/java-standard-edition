package methods;

public class VarArgMethod {

  // Declaration of var-arg method
  public static void displayInfo(int... x) {
    System.out.println("Variable number of arguments");
  }

  public static void main(String[] args) {
    //Calling the var-arg method
    displayInfo();
    displayInfo(10, 20);
    displayInfo(5, 10, 15);
  }

}

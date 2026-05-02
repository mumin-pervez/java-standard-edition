package variables;

public class InstanceVariableAccess {

  // num1 and num2 are instance variable
  // declared inside the class and outside the method or blocks or constructors
  int num1 = 10;
  int num2 = 15;

  void instanceMethod() {
    // In the instance area, we can directly access instance variables
    System.out.println("From Instance area: " + num1);
    System.out.println("From Instance area: " + num2);
  }

  public static void main(String[] args) {
    // In the static area we can't directly access instance variable
    // System.out.println(num1);
    InstanceVariableAccess obj = new InstanceVariableAccess();
    // Using object reference we can access the instance variables
    System.out.println("From Static area" + obj.num1);
    System.out.println("From Static area" + obj.num2);
  }

}

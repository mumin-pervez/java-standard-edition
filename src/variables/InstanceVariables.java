package variables;

public class InstanceVariables {

  int num1 = 10; //Instance variable
  int num2 = 20; //Instance variable

  //Instance method
  void add() {
    System.out.println("First Number: " + num1);
    System.out.println("Second Number: " + num2);
    System.out.println("Addition of " + num1 + " and " + num2 + " is : " + (num1 + num2));
  }

  //Static method
  static void mul() {
    InstanceVariables obj2 = new InstanceVariables();
    System.out.println("First number: " + obj2.num1);
    System.out.println("Second number: " + obj2.num2);
    System.out.println("Multiplication is : " + (obj2.num1 * obj2.num2));
  }

  public static void main(String[] args) {
    InstanceVariables obj = new InstanceVariables();
    System.out.println("Instance method in Static area");
    obj.add();
    System.out.println("Static method Static area using object");
    obj.mul();
    System.out.println("Static method calling directly in static area");
    mul();
    System.out.println("Static method-Static area using Class name");
    InstanceVariables.mul();

  }

}

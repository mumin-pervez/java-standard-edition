package variables;

public class AssignmentVar1 {

  //Declaration of 2 static variables
  static int num1 = 10;
  static int num2 = 5;

  //static method
  static void add() {
    System.out.println("Addition is : " + (AssignmentVar1.num1 + AssignmentVar1.num2));
  }

  //static method
  static void mul() {
    System.out.println("Multiplication is : " + (AssignmentVar1.num1 * AssignmentVar1.num2));
  }

  public static void main(String[] args) {
    AssignmentVar1.add(); //Static method calling by using Class name
    mul(); //Static method calling direct but not recommended
  }

}

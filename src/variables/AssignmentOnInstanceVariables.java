package variables;

public class AssignmentOnInstanceVariables {

  int a = 20; //Instance variable declared inside class outside method
  int b = 10; //Instance variable

  //Instance variable in instance method
  //Direct access is possible
  void add() {
    System.out.println(a + b);
  }

  //Instance variable in instance method
  //Access data using object creation (Recommended to Use)
  void mul() {
    AssignmentOnInstanceVariables objMul = new AssignmentOnInstanceVariables();
    System.out.println(objMul.a * objMul.b);
  }

  public static void main(String[] args) {
    AssignmentOnInstanceVariables obj = new AssignmentOnInstanceVariables();
    obj.add();
    obj.mul();
  }

}

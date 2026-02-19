package methods;

public class LocalVariableValue {

  //Instance variable: Declared inside the class & outside method
  int num1 = 10;
  int num2 = 20;

  //Instance method
  void add(int num1, int num2) { //local variable declared inside method
    System.out.println("Local: " + (num1 + num2)); //Priority always goes to local variables
    //To print the instance variables, use object
    LocalVariableValue obj = new LocalVariableValue();
    System.out.println("Instance: " + (obj.num1 + obj.num2));
    //Without creating object we can use "this" keyword.
    System.out.println("Using this keyword: " + (this.num1 + this.num2));
  }

  public static void main(String[] args) {
    LocalVariableValue obj = new LocalVariableValue();
    obj.add(5, 15);
  }
}

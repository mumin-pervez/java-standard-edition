package blocks;

public class FinalInstanceVariable {

  int num; //Instance variable

  void display() {
    System.out.println(num);
  }

  final int num2; // final instance variable

  // Initailize the final instance variable using instance block or constructor but not both at a time
/*  {
    num2 = 100;
  }*/

  FinalInstanceVariable() {
    num2 = 200;
  }

  void display2() {
    System.out.println(num2);
  }

  public static void main(String[] args) {
    FinalInstanceVariable fv = new FinalInstanceVariable();
    fv.display(); // Output: 0 (Default value)
    fv.display2(); // Output: 100
  }

}

package methods;

public class MethodSignature {

  void displayInfo(int a) {
    System.out.println("Course No: " + a);
  }

  void displayInfo(String name) {
    System.out.println("Course Name: " + name);
  }

  public static void main(String[] args) {
    MethodSignature obj = new MethodSignature();
    obj.displayInfo(1);
    obj.displayInfo("Core Java");
  }

}

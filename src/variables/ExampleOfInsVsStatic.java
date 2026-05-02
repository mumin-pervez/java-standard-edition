package variables;

public class ExampleOfInsVsStatic {

  static int x = 10; // Static variable
  int y = 20; // Instance variable

  public static void main(String[] args) {
    ExampleOfInsVsStatic obj1 = new ExampleOfInsVsStatic();
    System.out.println("Before update Static variable value: " + x);
    System.out.println("Before update Instance variable value: " + obj1.y);
    obj1.x = 100;
    obj1.y = 200;
    System.out.println("After update value of Static variable : " + x);
    System.out.println("After update value of Instance variable : " + obj1.y);

    obj1.x = 1000;
    obj1.y = 2000;
    System.out.println("After update value of Static variable : " + x);
    System.out.println("After update value of Instance variable : " + obj1.y);

    ExampleOfInsVsStatic obj2 = new ExampleOfInsVsStatic();
    System.out.println("After update value of Static variable : " + x);
    System.out.println("After update value of Instance variable : " + obj2.y);

  }

}

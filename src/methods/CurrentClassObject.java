package methods;

public class CurrentClassObject {

  int num1 = 10;
  int num2 = 20;

  void add(int num1, int num2) {
    System.out.println("Addition is : " + (num1 + num2));
    System.out.println("Addition is : " + (this.num1 + this.num2));
  }

  public static void main(String[] args) {
    CurrentClassObject obj = new CurrentClassObject();
    obj.add(25, 15);
  }

}

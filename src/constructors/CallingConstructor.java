package constructors;

public class CallingConstructor {

  CallingConstructor() {
    this(1);
    System.out.println("0-arg Constructor");
  }

  CallingConstructor(int a) {
    this(12, 45);
    System.out.println("1-arg Constructor");
  }

  CallingConstructor(int a, int b) {
    System.out.println("2-arg Constructor");
  }

  public static void main(String[] args) {
    CallingConstructor obj = new CallingConstructor();
/*    CallingConstructor obj1 = new CallingConstructor(14);
    CallingConstructor obj2 = new CallingConstructor(11, 22);*/
  }

}

package constructors;

public class ZeroArgConstructor {

  ZeroArgConstructor() {
    System.out.println("0-arg constructor");
  }

  ZeroArgConstructor(int id) {
    System.out.println("1-arg constructor");
  }

  public static void main(String[] args) {
    ZeroArgConstructor obj = new ZeroArgConstructor();
    ZeroArgConstructor obj1 = new ZeroArgConstructor(52);

  }

}

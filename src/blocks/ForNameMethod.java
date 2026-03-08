package blocks;

class Test {

  {
    System.out.println("Instance Block");
  }

  static {
    System.out.println("Static Block");
  }

  Test() {
    System.out.println("0-arg Constructor");
  }

  void wish() {
    System.out.println("Wishing you good luck");
  }
}

public class ForNameMethod {

  public static void main(String[] args) throws Exception {
   /* Test test = new Test();
    Test test1 = new Test();
    System.out.println("=====================");*/
    //Now using forName() method
    Class.forName("blocks.Test"); // Load the class - Test
    Class c = Class.forName("blocks.Test"); // It returns Class object
    Test t = (Test) c.newInstance(); //c is pointing to the loaded class
    t.wish();
  }

}

package blocks;

class Example {

  static {
    System.out.println("Static block executed");
  }

  public Example() {
    System.out.println("Constructor executed");
  }
}

public class ForName {

  public static void main(String[] args) throws Exception {
    // Loading the class using Class.forName()
    Class.forName("blocks.Example"); // Static block will run here

    // Creating an object using newInstance()
    Example obj = Example.class.newInstance(); // Constructor will run here
  }
}
package interfaces;

interface Greeting {

  default void greet() {
    System.out.println("Greetings from Greeting Interface");
  }
}

class Parent {

  public void greet() {
    System.out.println("Greetings from Parent Class");
  }
}

// Class method takes precedence over default method
class Child extends Parent implements Greeting {

  // No need to override - Parent's greet() is used
  // But can override if needed
  @Override
  public void greet() {
    super.greet();  // Call parent's version
    Greeting.super.greet();  // Call interface's default
    System.out.println("Hello from Child");
  }
}

public class InterfaceClassMethodConflict {

  public static void main(String[] args) {
    Child child = new Child();
    child.greet();
  }
}

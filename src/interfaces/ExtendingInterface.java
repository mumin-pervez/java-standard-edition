package interfaces;

interface Animal {

  void breathe();
}

// An interface can extend another interface
interface Mammal extends Animal {

  void giveBirth();
}

class Dog implements Mammal {

  @Override
  public void breathe() {
    System.out.println("Dog breathes");
  }

  @Override
  public void giveBirth() {
    System.out.println("Dog gives birth to puppies");
  }
}

public class ExtendingInterface {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.breathe();
    dog.giveBirth();
  }
}

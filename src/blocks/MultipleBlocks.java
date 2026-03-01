package blocks;

public class MultipleBlocks {

  MultipleBlocks() {
    System.out.println("0-arg Constructor");
  }

  MultipleBlocks(int a) {
    System.out.println("0-arg Constructor");
  }

  {
    System.out.println("Instance block-1");
  }

  {
    System.out.println("Instance block-2");
  }

  static {
    System.out.println("Static block-1");
  }

  static {
    System.out.println("Static block-2");
  }

  public static void main(String[] args) {
    MultipleBlocks obj = new MultipleBlocks();
    MultipleBlocks obj1 = new MultipleBlocks(55);
  }

}

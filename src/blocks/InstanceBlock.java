package blocks;

public class InstanceBlock {

  {
    System.out.println("Instance block executes at object creation");
  }

  public static void main(String[] args) {
    InstanceBlock obj = new InstanceBlock();
  }

}

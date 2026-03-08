package blocks;

public class StaticFinalVariable {

  static int num1; // No need to initialize
  static final int num2; // Must initialize

  // Initialize using static blocks
  static {
    num2 = 15;
  }

  void showStaticFinalValue() {
    System.out.println(num1); //Output: 0 (default value)
    System.out.println(num2); //Output: 15 (assigned value)
  }

  public static void main(String[] args) {
    StaticFinalVariable sfv = new StaticFinalVariable();
    sfv.showStaticFinalValue();
  }
}

package variables;

public class StaticVariables {

  static int x = 10; //Static variables
  static int y = 20; //Static variables

  void add() {
    System.out.println("Static variables in Instance Method");
    System.out.println(x);
    System.out.println(StaticVariables.y); //Recommended to use
  }

  public static void main(String[] args) {
    StaticVariables st = new StaticVariables();
    st.add();
    System.out.println("Static variables in Static area");
    System.out.println(x);
    System.out.println(y);
  }

}

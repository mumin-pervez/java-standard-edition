package methods;

public class MethodBasics {

  //Instance method: access the instance method using object name
  void wish() {
    System.out.println("Hello Dear!!!");
  }

  //Instance method: access the instance method using object name
  void add(int num1, int num2) {
    int sum; //num1, num2 and sum are local variable
    int res; // Must initialize local variables if we want to use
    // System.out.println(res);
    sum = num1 + num2;
    System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
  }

  //Static method: access the static method using class name
  static void login(String username, String password) {
    if (username.equals("mumin") && password.equals("1234")) {
      System.out.println("Login Success");
    } else {
      System.out.println("Login Failed !!!");
    }
  }

  public static void main(String[] args) {
    MethodBasics obj = new MethodBasics();
    obj.wish();
    obj.add(10, 20);
    MethodBasics.login("mumin", "1234");
  }

}

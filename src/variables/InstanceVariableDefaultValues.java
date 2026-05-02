package variables;

public class InstanceVariableDefaultValues {

  byte b;
  short s;
  int i;
  long l;
  float f;
  double d;
  char ch;
  boolean bo;

  public static void main(String[] args) {
    InstanceVariableDefaultValues obj = new InstanceVariableDefaultValues();
    // These default values are provided by the JVM
    System.out.println("Default value for byte type: " + obj.b);
    System.out.println("Default value for short type: " + obj.s);
    System.out.println("Default value for int type: " + obj.i);
    System.out.println("Default value for long type: " + obj.l);
    System.out.println("Default value for float type: " + obj.f);
    System.out.println("Default value for double type: " + obj.d);
    System.out.println("Default value for char type: " + obj.ch);
    System.out.println("Default value for boolean type: " + obj.bo);
  }

}

package constructors;

public class LocalVarToInstanceVar {

  int id;
  String name;

  LocalVarToInstanceVar(int id, String name) { // id and name are local variable
//assign local data to instance data using "this" keyword
    this.id = id;
    this.name = name;
  }

  void status() {
    if (id == 101) {
      System.out.println("Doctor");
    } else if (id == 201) {
      System.out.println("Nurse");
    } else {
      System.out.println("Admin");
    }
  }

  public static void main(String[] args) {
    LocalVarToInstanceVar obj = new LocalVarToInstanceVar(101, "Shams");
    obj.status();
  }

}

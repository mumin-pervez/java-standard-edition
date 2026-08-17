package classobjects;

class Patient {

  String name;
  int age;
}

public class StateOfAnObject {

  public static void main(String[] args) {
    Patient patient1 = new Patient(); //Object creation
    patient1.name = "Mannan Khan";
    patient1.age = 122;

/*    The state of patient1 is approximately
    name = Mannan Khan
    age = 122
    */

    // Another object can have a different state:
    Patient patient2 = new Patient();
    patient2.name = "Kundu Ji";
    patient2.age = 33;

    // Both objects belong to the same class but their state are different

  }

}

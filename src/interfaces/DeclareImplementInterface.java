package interfaces;

//Declaring an Interface
interface Department {

  void canHoldRooms();

  void canHoldDoctors();
}

// Implementing the interface
class DepartmentImplementation implements Department {

  @Override
  public void canHoldRooms() {
    System.out.println("Rooms will be shown");
  }

  @Override
  public void canHoldDoctors() {
    System.out.println("Doctor List will be shown");
  }
}

//Using the implementation
public class DeclareImplementInterface {

  public static void main(String[] args) {
    Department department = new DepartmentImplementation();  // Interface reference
    department.canHoldRooms();
    department.canHoldDoctors();
  }

}

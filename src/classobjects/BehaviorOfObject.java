package classobjects;

class Doctor {

  int drId;
  String drName;

  void prescribe() {
    System.out.println(drName + " is Prescribing now whose Id is : " + drId);
  }

}

public class BehaviorOfObject {

  public static void main(String[] args) {
    Doctor doctor1 = new Doctor();
    doctor1.drId = 101;
    doctor1.drName = "Dr. Alim Al Razin";
    doctor1.prescribe();
  }

}

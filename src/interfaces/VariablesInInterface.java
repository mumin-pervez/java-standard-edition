package interfaces;

interface VarInterface {

  // Interface variables are always : public, static and final
  int TOTAL_BED = 500;
  String hospitalName = "Sarkari Karmocari Hospital";
}

class HospitalInfo implements VarInterface {

  void displayInfo() {
    System.out.println("Hospital Name: " + hospitalName);
    System.out.println("Total Bed Count: " + TOTAL_BED);
  }
}

public class VariablesInInterface {

  public static void main(String[] args) {
    System.out.println(VarInterface.hospitalName);
    System.out.println("====================================");
    HospitalInfo obj = new HospitalInfo();
    obj.displayInfo();
  }

}

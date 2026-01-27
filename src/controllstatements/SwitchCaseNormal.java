package controllstatements;

public class SwitchCaseNormal {

  public static void main(String[] args) {
    int a = 4;
    switch (a) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Primary Student");
        break;
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        System.out.println("School Student");
        break;
      case 11:
      case 12:
        System.out.println("College Student");
        break;
      default:
        System.out.println("Not a Student");
    }
  }

}

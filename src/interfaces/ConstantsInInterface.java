package interfaces;

interface PaymentGateway {

  // Standard error codes
  int SUCCESS = 200;
  int FAILURE = 400;
  int PENDING = 202;
  String BASE_URL = "https://api.payment.com";
  String API_VERSION = "v1";

  void processPayment(double amount);
}

class SSLCommerz implements PaymentGateway {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing $" + amount + "via SSLCOMMERZ");
    System.out.println("API: " + BASE_URL + "/" + API_VERSION);
    if (amount > 0) {
      System.out.println("Status code: " + SUCCESS);
    } else {
      System.out.println("Status Code: " + FAILURE);
    }
  }
}

public class ConstantsInInterface {

  public static void main(String[] args) {
    SSLCommerz sslCommerz = new SSLCommerz();
    sslCommerz.processPayment(120.00);
  }

}

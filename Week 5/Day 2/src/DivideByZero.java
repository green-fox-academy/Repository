// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberToBeDivided = scanner.nextInt();
    try {
      int result = 10 / numberToBeDivided;
      System.out.println("The result is " + result);
    } catch (Exception ex) {
      System.out.println("Fail");
    }
  }
}

import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String userInput = name.nextLine();
        System.out.println("Hello, " + userInput);
    }
}

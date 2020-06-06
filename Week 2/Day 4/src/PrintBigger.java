// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner input1 = new Scanner (System.in);
        int a = input1.nextInt();
        Scanner input2 = new Scanner (System.in);
        int b = input2.nextInt();
        if (a > b) {
            System.out.println(a + " Is bigger!");
        } else {
            System.out.println(b + " Is bigger!");
        }
    }
}

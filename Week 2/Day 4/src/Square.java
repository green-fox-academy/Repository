// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        for (int i = 0; i <= s; i++) {
            for ( int j = 0; j <= s; j++){
                if (i == 0 || j == 0 || i == s || j == s) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}

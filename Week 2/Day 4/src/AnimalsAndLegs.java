// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int chicken = input1.nextInt();
        System.out.println("The farmer has " + chicken + " chickens.");
        Scanner input2 = new Scanner(System.in);
        int pigs = input2.nextInt();
        System.out.println("The farmer has " + pigs + " pigs.");
        int legs = (chicken * 2)+(pigs * 4);
        System.out.println("The animals have " + legs + " legs");
    }
}

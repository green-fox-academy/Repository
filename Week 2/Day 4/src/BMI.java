// Print the Body mass index (BMI) based on these values

public class BMI {
    public static void main(String[] args) {
        double massInKg = 81;
        double heightInM = 1.83;
        double bmi = (massInKg / (heightInM * heightInM));
        System.out.println("Your Body Mass value is: " + bmi);
    }
}

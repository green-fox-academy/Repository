// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52

public class CodingHours {
    public static void main(String[] args) {
        int oneDay = 6;
        int semester = 17;
        int oneWeek = oneDay * 5;
        int codingHours = oneWeek * semester;
        int avgHours = 52;
        float percent = ( (float) oneWeek / avgHours) * 100;
        int percentage = (int) percent;
        System.out.println("One semester a trainee codes for " + codingHours + " hours");
        System.out.println(percentage + "% of work hours spent coding!");
    }
}

import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int maxDay = 0;

        switch (birthMonth) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29;
                break;
            default:
                maxDay = 31;
                break;
        }

        int birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDay);
        System.out.println ("Your birth date is: " + birthMonth + "/" + birthDay + "/" + birthYear);









    }
}

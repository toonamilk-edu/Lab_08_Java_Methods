import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Method A test
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Method B test
        int number = SafeInput.getInt(in, "Enter an int");
        System.out.println("You entered: " + number);

        // Method C test
        double decimal = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered: " + decimal);

        // Method D test
        int rangedInt = SafeInput.getRangedInt(in, "Enter an int between 1 and 10", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Method E test
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double between 0.0 and 10.0", 0.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        // Method F test
        boolean yesNo = SafeInput.getYNConfirm(in, "Do you want to continue? (Y/N)");
        System.out.println("You entered: " + yesNo);

        // Method G test
        String code = SafeInput.getRegExString(in, "Enter a 3-digit number", "^\\d{3}$");
        System.out.println("You entered: " + code);
    }

}
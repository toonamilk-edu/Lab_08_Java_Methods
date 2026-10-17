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
    }

}
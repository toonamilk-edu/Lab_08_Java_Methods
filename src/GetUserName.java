import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name ");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name ");
        String userName = SafeInput.getNonZeroLenString(in, "Enter your selected username ");

        System.out.println("Your first name is: " + firstName);
        System.out.println("Your last name is: " + lastName);
        System.out.println("Your selected username is: " + userName);




    }




}

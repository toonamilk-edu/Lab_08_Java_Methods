import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String mNumber = SafeInput.getRegExString(input, "Enter your M Number (format: M#####): ", "^(M|m)\\d{5}$");
        String SSN = SafeInput.getRegExString(input, "Enter your SSN (format: XXX-XX-XXXX): ", "^\\d{3}-\\d{2}-\\d{4}$");
        String menuChoice = SafeInput.getRegExString(input, "Enter your menu choice: O=Open, S=Save, V=View, Q=Quit ", "^[OoSsVvQq]$");


















    }



}



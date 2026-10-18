import java.util.Scanner;


public class CheckOut {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        boolean moreItems = true;
        double total = 0.0;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item (between 0.50 and 10.00): ", 0.50, 10.00);
            total = total + itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to check out? (Y/N): ");

        } while (moreItems);


        System.out.printf("The total price of all items is: $%.2f", total);



    }


}




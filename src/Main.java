
import java.util.Scanner;

public class Main {

    // class shippingCost
    //  main()
    //      num itemPrice
    //      num totalPrice
    //      num shippingPrice
    //      output “Please enter the cost of the item you would like to ship:”
    //      input itemPrice
    //  if itemPrice >= 100 then
    //      totalPrice = itemPrice
    //      output “You have zero shipping fees, your total cost is:” + totalPrice
    //  else
    //      shippingPrice = itemPrice * 0.02
    //      output “Your cost of shipping is:” + shippingPrice
    //      totalPrice = shippingPrice + itemPrice
    //      output “Your total cost is:” + totalPrice
    //  end if
    //  return
    // end class



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item you would like to ship: ");

        double itemPrice = 0.00;
        double totalPrice = 0.00;
        double shippingPrice = 0.00;
        String trash = "";

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            if (itemPrice >= 100.00) {
                totalPrice = itemPrice;
                System.out.printf("You have zero shipping fees, your total cost is: " + totalPrice);
                in.nextLine();
            } else {
                shippingPrice = itemPrice * 0.02;
                System.out.printf("Your cost of shipping is: " + shippingPrice);
                totalPrice = shippingPrice + itemPrice;
                System.out.printf(" Your total cost is: " + totalPrice);
                in.nextLine();
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said the cost of your item was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");

        }
    }
}

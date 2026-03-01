import java.util.ArrayList;
import java.util.Scanner;

public class Abdo_Sigmacomputer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] pruductnames = {"Laptop", "Headphones", "Keyboard", "Mouse"};
        double[] productprices = {35000, 2000, 1500, 650};

        ArrayList<String> cartItems = new ArrayList<>();
        ArrayList<Integer> cartQuantities = new ArrayList<>();
        ArrayList<Double> cartTotals = new ArrayList<>();

        double total = 0;
        int choice;

        System.out.println("======== Welcome to Sigma Computer ========");

        do {

            System.out.println("\nMenu:");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            choice = input.nextInt();

            if (choice == 1) {

                System.out.println("\nAvailable Products:");

                for (int i = 0; i < pruductnames.length; i++) {

                    System.out.print(i + 1);
                    System.out.print(". ");
                    System.out.print(pruductnames[i]);
                    System.out.print(" - ");
                    System.out.print(productprices[i]);
                    System.out.println(" EGP");
                }
            }

            else if (choice == 2) {

                System.out.print("Enter product number: ");
                int productindex = input.nextInt() - 1;

                if (productindex >= 0 && productindex < pruductnames.length) {

                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    double itemTotal = productprices[productindex] * quantity;

                    cartItems.add(pruductnames[productindex]);
                    cartQuantities.add(quantity);
                    cartTotals.add(itemTotal);

                    total += itemTotal;

                    System.out.println("Product added successfully!");

                } else {
                    System.out.println("Invalid product number!");
                }
            }

            else if (choice == 3) {

                if (cartItems.size() == 0) {
                    System.out.println("Your cart is empty.");
                } else {

                    System.out.println("\nYour Cart:");

                    for (int i = 0; i < cartItems.size(); i++) {

                        System.out.print(cartItems.get(i));
                        System.out.print(" | Quantity: ");
                        System.out.print(cartQuantities.get(i));
                        System.out.print(" | Item Total: ");
                        System.out.println(cartTotals.get(i));
                    }

                    System.out.println("Current Total: " + total + " EGP");
                }
            }

            else if (choice == 4) {

                if (total == 0) {
                    System.out.println("Your cart is empty.");
                } else {
                    System.out.printf("Your final total is: %f EGP\n",total);
                    System.out.println("Thank you for shopping!");
                }
            }

            else if (choice == 5) {
                System.out.println("\nThank you for choosing Sigma Computer!");
                System.out.println("Exiting system...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        /*
            Let's build an e-commerce console app.

            * Using :
            - OOP
            - Arrays
            - ArrayLists
            - WhileLoops


            * Features :
            - Product Catalog (PDP) - a list of available products
            - Shopping Cart - user can add products to their cart
            - User Interaction - a console menu for navigating the application

         */

        // Initialize 10 products
        Product products[] = new Product[10];
        products[0] = new Product(1,"Dell 3250", 1999.99);
        products[1] = new Product(2,"Iphone 15", 30000.00);
        products[2] = new Product(3,"Lays Chips", 15.00);
        products[3] = new Product(4,"Laser Printer", 5000.00);
        products[4] = new Product(5,"Hisense Fridge", 8000.00);
        products[5] = new Product(6,"JVC Smart TV", 4500.00);
        products[6] = new Product(7,"Samsung OLED Screen", 15000.00);
        products[7] = new Product(8,"Bike", 2000.00);
        products[8] = new Product(9,"Keyboard Reddragon", 499.00);
        products[9] = new Product(10,"Apple Macbook Pro", 300000.00);

        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        // 0 = exit
        int choice = 1;

        while(choice!=0){
            pl("\nWelcome to Takealot Console V1.0");
            pl("1. View Products");
            pl("2. Add Product to Cart");
            pl("3. View Shopping Cart");
            pl("0: Exit");

            p("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    // Exit
                    pl("Thank you for choosing Takelot! goodbye!");
                    break;
                case 1:
                    // View products
                    pl("\nProduct Catalog: ");
                    for(Product product : products){
                        product.displayProduct();
                    }
                    break;
                case 2:
                    // Add to cart
                    p("Enter the Product Id to add to cart: ");
                    int productId = scanner.nextInt();
                    boolean found = false;
                    for (Product product:products){
                        if(product.getId()==productId){
                            cart.addProduct(product);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        pl("Product not found.");
                    }
                    break;
                case 3:
                    cart.viewcart();
                    break;
                default:
                    pl("Invalid choice. Please try again.");
            }

        }

    }

    private static void pl(String s){
        System.out.println(s);
    }

    private static void p(String s){
        System.out.print(s);
    }
}
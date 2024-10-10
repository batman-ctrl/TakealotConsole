import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> cartItems;

    public ShoppingCart(){
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product){
        cartItems.add(product);
        System.out.println(product.getName()+" has been added to your cart.");
    }

    public void viewcart(){
        if(cartItems.isEmpty()){
            System.out.println("Your cart is empty.");
        }else{
            System.out.println("Your shopping cart:");
            double total = 0;
            for(Product product : cartItems){
                product.displayProduct();
                total+=product.getPrice();
            }
            System.out.println("Total : R"+total);
        }
    }
}

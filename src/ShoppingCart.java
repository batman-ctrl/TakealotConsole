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
}

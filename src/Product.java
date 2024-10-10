public class Product {

    private int id;
    private String name;
    private Double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayProduct(){
        System.out.println(id+" - "+name+" - R"+price);
    }
}

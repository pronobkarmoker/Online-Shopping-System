import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public ShoppingCart() {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public double calculateTotalPrice(){
        double totalprice =  0.0;
        for(Product p : products){
            totalprice += p.getPrice();
        }
        return totalprice;
    }

    public void displayCart(){
        System.out.println("Shopping cart : ");
        for(Product p : products){
            p.display();
            System.out.println();
        }
        System.out.println("Total Price : $" + calculateTotalPrice());
    }
}

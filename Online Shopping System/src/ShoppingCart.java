import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void payment() {
        System.out.println("You have to pay : " + calculateTotalPrice());
        System.out.println("Enter 1 or 2 :");
        Scanner s = new Scanner(System.in);
        System.out.println("**** MENU ****");
        System.out.println("1. CASH ");
        System.out.println("2. CARD ");
        int val = s.nextInt();
        switch (val) {
            case 1:
                int amount = s.nextInt();
                if (amount > calculateTotalPrice()) {
                    int back = (int) (amount - calculateTotalPrice());
                    System.out.println("Succesfully back : " + back);
                } else {
                    System.out.println("payment complete...");
                }
                break;
            case 2:
                System.out.println("enter your card number : ");
                String cardnum = s.next();
                if (cardnum.length() == 10) {
                    System.out.println("payment complete !!!");
                } else {
                    System.out.println("please enter valid card");
                }
                break;
            default:
                System.out.println("Enter 1 or 2");
        }
   }
}    
    

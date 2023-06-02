public abstract class Product {
    private int ProductID;
    private String name;
    private int price;

    public Product(int productID, String name, int price) {
        ProductID = productID;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscountedPrice();
    public void display(){
        System.out.println("ID :" + ProductID);
        System.out.println("name :" + name);
        System.out.println("Price :" + price);
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Electronics extends Product implements Discountable{
    private String brand;
    private int Warrantyperiod;

    public Electronics(int productID, String name, int price, String brand, int warrantyMonth) {
        super(productID, name, price);
        this.brand = brand;
        this.Warrantyperiod = warrantyMonth;
    }


    @Override
    public double calculateDiscountedPrice() {
        return getPrice()*0.95; // 5% discount
    }
}

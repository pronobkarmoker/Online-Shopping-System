public class Book extends Product implements Discountable{
    private String author;
    private int publicationYear;

    public Book(int productID, String name, int price, String author, int publicationYear) {
        super(productID, name, price);
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice()*0.9; //10% discount
    }
}

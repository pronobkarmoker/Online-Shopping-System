public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(123456789,"JAVA",35,"Bojlur rahman",2023);
        Book book2 = new Book(123456789,"c",30,"h sheld",2020);
        System.out.println("BOOK's DETAILS....");
        book1.display();
        System.out.println("DISCOUNTED PRICE $: " + book1.calculateDiscountedPrice());
        book2.display();
        System.out.println("DISCOUNTED PRICE $: " + book2.calculateDiscountedPrice());
        System.out.println();

        Electronics electronics = new Electronics(555, "laptop",500, "Apple", 24);
        System.out.println("Electronics Details:");
        electronics.display();
        System.out.println("Discounted Price: $" + electronics.calculateDiscountedPrice());
        System.out.println();

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(book2);
        cart.addProduct(book1);
        cart.addProduct(electronics);

        cart.displayCart();

        cart.calculateTotalPrice();

        cart.removeProduct(book2);

        cart.displayCart();
        cart.calculateTotalPrice();

        }

    }

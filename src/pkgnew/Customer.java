package pkgnew;

public class Customer {
    private Book b;
    private int id;
    private static int IdForAll=0;
    public Customer(Book b) {
        this.b = b;
        id = IdForAll++;
    }
    public Book getB() {
        return b;
    }

    public int getId() {
        return id;
    }
}

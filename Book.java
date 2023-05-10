public class Book extends Product {

    String author;

    public Book() {
    }

    public Book(String name, double price,String author) {
        super(name,price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public double getDiscount(){
        return price-(price*0.4);
    }
}

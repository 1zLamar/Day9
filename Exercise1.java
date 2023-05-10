// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercise1 {
    public static void main(String[] args) {

        Book b1=new Book("it starts with us",120,"Colleen Hoover");
        System.out.println("Book name: "+b1.getName());
        System.out.println("Price before discount: "+b1.getPrice());
        System.out.println("author: "+b1.getAuthor());
        System.out.println("The price after discount: "+b1.getDiscount());
        System.out.println();

        Movie m1=new Movie("Me before you",230,"Thea Sharrock");
        System.out.println("Movie name: "+m1.getName());
        System.out.println("Price before discount: "+m1.getPrice());
        System.out.println("author: "+m1.getDirector());
        System.out.println("The price after discount: "+m1.getDiscount());


        }
}
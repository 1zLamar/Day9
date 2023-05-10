// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercise2 {
    public static void main(String[] args) {

        MovablePoint m1=new MovablePoint(36,23,6,11);

        m1.moveDown();
        m1.moveLeft();
        System.out.println(m1.toString());
        System.out.println();

        MovablePoint m2=new MovablePoint(8,15,3,9);

        m2.moveRight();
        m2.moveUp();
        System.out.println(m2.toString());


    }
}
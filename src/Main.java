public class Main {
    public static void main(String[] args) {

        Shape s = new Rectangle();
        s.getPerimeter();

        Rectangle r1 = new Rectangle(5,5);
        Square s1 = new Square(5);
        System.out.println( r1.compareTo(s1) );

    }
}
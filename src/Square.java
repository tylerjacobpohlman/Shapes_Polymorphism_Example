/**
 * @author Tyler Pohlman
 * @version 1.1
 * @since 04/05/2023
 */
public class Square extends Rectangle{
    /**
     * Default Square Constructor
     */
    //super() is implicitly called, so it's not need
    public Square() {}

    /**
     * Square Constructor
     * @param side one side of the square
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * NOTE: A square is of type rectangle, so the methods getArea() and getPerimeter() are already
     * defined in the rectangle class. Furthermore, there's no need to override the Rectangle methods
     * because the calculations to get a rectangle's area and perimeter work for a square.
     */

    //simple override of the toString() method in the Object class
    @Override
    public String toString() {
        return "Shape: Square" +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }

}

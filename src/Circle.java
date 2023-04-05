/**
 * @author Tyler Pohlman
 * @version 1.1
 * @since 04/05/2023
 */
public class Circle extends Ellipse{
    /**
     * Default Circle Constructor
     */
    public Circle() {}

    /**
     * Circle Constructor
     * @param radius double
     */
    public Circle(double radius) {
        //only radius is ever needed for the calculations, so the 2nd stored value is irrelevant
        super(radius, 0.0);
    }


    /**
     * NOTE: Unlike the Square class, the circle class overrides the methods getPerimeter() and getArea() form the Ellipse class.
     */

    /**
     * Returns the perimeter of the circle.
     * @return double
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * height;
    }

    /**
     * Returns the area of the circle.
     * @return double
     */
    @Override
    public double getArea() {
        return Math.PI * height * height;
    }

    //simple override of the toString() method in the Object class
    @Override
    public String toString() {
        return "Circle: Ellipse" +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }

}

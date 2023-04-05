/**
 * @author Tyler Pohlman
 * @version 1.1
 * @since 04/05/2023
 */
public class Ellipse extends Shape {
    /**
     * Default Ellipse Constructor
     */
    public Ellipse() {}

    /**
     * Ellipse Constructor
     * @param minorAxis otherwise known as the first radius from the center
     * @param majorAxis otherwise known as the second radius from the center
     */
    public Ellipse(double minorAxis, double majorAxis) {
        super(minorAxis, majorAxis);
    }

    /**
     * Returns the perimeter of the ellipse.
     * @return double
     */
    @Override
    public double getPerimeter() {
        //comes from ramanujan ellipse perimeter formula
        return Math.PI * ( (3 * (width + height) ) - Math.sqrt( (3 * width + height) * (width + 3 * height) ) );
    }

    /**
     * Returns the area of the ellipse.
     * @return double
     */
    @Override
    public double getArea() {
        return Math.PI * height * width;
    }

    //simple override of the toString() method in the Object class
    @Override
    public String toString() {
        return "Shape: Ellipse" +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}

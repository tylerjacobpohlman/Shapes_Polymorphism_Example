/**
 * @author Tyler Pohlman
 * @version 1.0
 * @since 04/04/2023
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
}

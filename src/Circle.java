/**
 * @author Tyler Pohlman
 * @version 1.0
 * @since 04/04/2023
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

}

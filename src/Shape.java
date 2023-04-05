/**
 *
 * @author Tyler Pohlman
 * @version 1.0
 * @since 04/04/2023
 */
public abstract class Shape implements Comparable<Shape> {
    // default height and width are set to 0.0
    // the "protected" keyword allows access to the attributes height and width if another class extends Shape
    protected double height = 0.0;
    protected double width = 0.0;

    /**
     * Default Shape Constructor
     */
    // Nothing is in the body of the code since height and width's default
    // values are already expressed above.
    protected Shape() {}
    /**
     * Shape Constructor
     * @param height the height of the shape
     * @param width the width of the shape
     * */
    protected Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Returns the perimeter of the shape.
     * @return double
     */
    public abstract double getPerimeter();

    /**
     * Returns the area of the shape.
     * @return double
     */
    public abstract double getArea();

    //The beauty of having the compareTo(T o) method in the superclass is that every class that extends Shape is an
    //instance of Shape, meaning every class that implements Shape has access to this method. Also, every child class
    //implements the method getArea(). So, every child class of Shape can compare to all other child classes of shape

    /**
     * Compares the area of the given shape to another shape.
     * @param otherShape the shape to be compared
     * @return -1 if the area of the shape is less than the area of the other shape, 1 if the area of the shape is
     * greater than the area of the other shape, and 0 if the areas of the two shapes are equal.
     */
    @Override
    public int compareTo(Shape otherShape)
    {
        if(this.getArea() < otherShape.getArea() ) {
            return -1;
        }
        else if(this.getArea() > otherShape.getArea() ) {
            return 1;
        }
        else {
            return 0;
        }
    }

}

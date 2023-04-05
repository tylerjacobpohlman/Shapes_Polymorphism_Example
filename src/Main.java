import java.util.Arrays.*;

/**
 * @author Tyler Pohlman
 * @version 1.1
 * @since 04/05/2023
 */


public class Main {
    public static void main(String[] args) {
        //creates a new array of type Shapes of size 5
        Shape[] shapesArray = new Shape[5];

        //adds shapes to the array
        shapesArray[0] = new Rectangle(5,4);
        shapesArray[1] = new Square(12) ;
        shapesArray[2] = new Ellipse(22.5, 13.33);
        shapesArray[3] = new Circle(30);
        shapesArray[4] = new Ellipse(13,5);

        //used the arrays sorting algorithm instead of creating my own
        java.util.Arrays.sort(shapesArray);

        //displays all the shapes
        for(int i = 0; i < shapesArray.length; i++) {
            System.out.println("**************************");
            System.out.println(shapesArray[i]);
            System.out.println("**************************");
            System.out.println();
        }






    }
}
import java.text.DecimalFormat;

/**
 * @file Polygon.java
 * @date 2/6/2023
 * @author Dylan Nguyen
 *
 * @description Creates a polygon with a side number, side length, and shape type, which the user can access and
 * print.
 */
public class Polygon {
     //instance variables
    private int numSides;
    private double sideLength;
    private String shapeType;

    //default constructor

    /**
     * @description Default constructor that creates a basic triangle with a side length of 1.0
     */
    boolean isValid;
    public Polygon(){
        numSides = 3;
        sideLength = 1.0;
        shapeType = "triangle";
        isValid = true;

    }

    //overloaded constructor

    /**
     * @description Creates a Polygon object with specified side number, side length, and shape type. If the
     *      * parameters are not greater than 0, they are set to the default parameters.
     * @param s number of sides in the Polygon
     * @param sl length of each side in the Polygon
     * @param st type of Polygon shape
     */
    public Polygon (int s, double sl, String st){

        if (s > 1 && sl > 0){
            numSides = s;
            sideLength =sl;
            shapeType = st;
            isValid = true;
        }

        if (s <= 1 && sl <= 0){
            numSides = 3;
            sideLength = 3.0;
            shapeType = "triangle";
            isValid = false;
        }

    }

    //accessors

    /**
     *
     * @return the number of polygon sides
     */
    public int getNumSides(){
            return numSides;
        }

    /**
     *
      * @return the length of each side of the polygon
     */
    public double getSideLength(){
            return sideLength;
        }

    /**
     *
      * @return a string indicating the type of polygon
     */
    public String getShapeType(){
            return shapeType;
        }

    //toString method
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with 2 decimal places
        if (isValid){
            return "Your shape is a " + getShapeType() + " and it has " + getNumSides() + " sides.";
        }
        else{
            return "Not a valid polygon. Your polygon was given a default of 3 sides , was named \"triangle\", and each side has a length of 1.0 units.";
        }

    }

}
import java.text.DecimalFormat;

/**
 * @file Polygon.java
 * @date 2/6/2023
 * @author Dylan Nguyen
 *
 * @description Creates a polygon with a side number, side length, and shape type, which the user can access and
 * print.
 */
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
    public Polygon(){
        numSides = 3;
        sideLength = 1.0;
        shapeType = "triangle";
    }

    //overloaded constructor

    /**
     * @description Creates a Polygon object with specified side number, side length, and shape type. If the
     *      * parameters are not greater than 0, they are set to 1.0.
     * @param s number of sides in the Polygon
     * @param sl length of each side in the Polygon
     * @param st type of Polygon shape
     */
    public Polygon (int s, double sl, String st){

        numSides = 1;
        sideLength = 1.0;
        st = shapeType;
        if(s > 0){
            numSides = s;
        }
        if(sl > 0){
            sideLength = sl;

    }

    //accessors
    public int getNumSides(){
        return numSides;
    }

    public double getSideLength(){
        return sideLength;
    }

    public String getShapeType(){
        return shapeType;
    }

    //toString method
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with 2 decimal places
        return "Your shape is a " + getShapeType() + " and it has " + getNumSides() + " sides.";
    }

}
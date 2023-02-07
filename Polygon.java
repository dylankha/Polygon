import java.text.DecimalFormat;

/**
 * @file Polygon.java
 * @date 2/6/2023
 * @author Dylan Nguyen
 *
 * @description Creates a polygon with a side number, side length, and shape type, which the user can access and
 * print. Also creates a boolean variable called "isValid" that identifies whether a generated Polygon is a valid polygon.
 */
public class Polygon {
     //instance variables
    private int numSides;
    private double sideLength;
    private String shapeType;
    private boolean isValid;
    //default constructor

    /**
     * @description Default constructor that creates a basic triangle (a three sided polygon) with a side length of 1.0
     */
    public Polygon(){
        numSides = 3;
        sideLength = 1.0;
        shapeType = "triangle";
        isValid = true;

    }

    //overloaded constructor

    /**
     * @description Creates a Polygon object with specified side number, side length, and shape type.
     * If a polygon has more than one side and has a positive side length, it is considered valid.
     * If it has 1 side or less or has a side length of 0 or less, it is considered invalid.
     * Otherwise, the polygon defaults to a triangle with 3 sides (3 sided, 1.0 length, "triangle").
     *
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

    //calculate methods

    /**
     *
     * @return the perimeter of the polygon by multiplying the number of sides by the length of each side,
     * outputting a double value.
     */
    public double calculatePerimeter(){
        return numSides * sideLength;
    }


    //toString method

    /**
     *
     * @return a string that contains the shape type and number of
     * sides if the polygon is valid, or the default polygon if the polygon was invalid.
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with 2 decimal places
        if (isValid){
            return "Your shape is a " + getShapeType() + " and it has " + getNumSides() + " sides." + "\n" +
                    "It has a side length of " + getSideLength() + "\n" +
                    "It has a perimeter of " + calculatePerimeter();
        }
        else{
            return "Not a valid polygon. Your polygon was given a default of 3 sides , was named \"triangle\", and each side has a length of 1.0 units.";
        }

    }

}
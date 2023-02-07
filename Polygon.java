import java.text.DecimalFormat;
public class Polygon {
    private int numSides;
    private double sideLength;
    private String shapeType;

    //constructors
    public Polygon(){
        numSides = 0;
        sideLength = 0.0;
        shapeType = "";
    }

    public Polygon (int s, double sl, String st){
        s = numSides;
        sl = sideLength;
        st = shapeType;

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
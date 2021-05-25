/*
 * File: Cylinder.java
 * 
 * Programmer: Daniel A. Alvarez
 * 
 * I affirm that this class is entirely my own work 
 * and none of it is the work of anyone else.
 */

/** A class to represent a cone 3D shape
 */
public class Cone extends Shape3D
{
    private int radius;    // the radius of the cone
    private int height;    // the height of the cone

    /** Constructs a Cone 3D shape object
     * 
     * @param x
     * @param y
     * @param z
     * @param r
     * @param h 
     */
    public Cone(int x, int y, int z, int r, int h) 
    {
        super(x, y, z);     // call the superclass constructor
        radius = r;         // initialize the raidu of the cone
        height = h;         // initialize the height of the cone      
    }

    /** Calculate the surface area of the cone
     * 
     * @return - the surface area of the cone
     */
    public double surfaceArea() 
    {
        // calculate and store th slant height of the cone
        double slant = Math.sqrt(radius * radius + height * height);
        
        // calculatr and store the surface area of the cone
        double area = Math.PI * radius * (radius + slant);
        
        return area;
    }

    /** Calculate the volume of the cone
     * 
     * @return - the volume of the cone
     */
    public double volume() 
    {
        // calculate and store the volume of the cone
        double volume = (Math.PI * radius * radius * height) / 3;
        
        return volume;
    }
    
    /** Write the information of the object in a string
     * 
     * @return - a string containing the shape, the center,
     * the radius, and the height
     */
    public String toString()
    {
        // create the string and store it
        String cone = "Cone with center at " + super.toString() 
                + ", a height of " + height + ", a radius of " + radius;
        
        return cone;
    }    
    
}

/*
 * File: Cylinder.java
 * 
 * Programmer: Daniel A. Alvarez
 * 
 * I affirm that this class is entirely my own work 
 * and none of it is the work of anyone else.
 */

/** A class to implement a cylinder 3D shape
 */
public class Cylinder extends Shape3D
{
    private int radius;   // radius of the cylinder
    private int height;   // height of the cylinder
    
    /** Construct a cylinder 3D shape object
     * 
     * @param x - x coordinate of the center
     * @param y - y coordinate of the center
     * @param z - z coordinate of the center
     * @param r - radius of the cylinder
     * @param h - height of the cylinder
     */
    public Cylinder(int x, int y, int z, int r, int h) 
    {
        super(x, y, z);    // call the superclass constructor
        radius = r;        // initialize the radius of the cylinder
        height = h;        // initialize the height of the cylinder
    }

    /** Calculate the surface area of the cylinder
     * 
     * @return - the surface area of the cylinder
     */
    public double surfaceArea()
    {
        // calculate and store the surface area of the cylinder
        double area = 2 * Math.PI * radius * radius 
                + 2 * Math.PI * radius * height;
        
        return area;
    }

    /** Calculate the volume of the cylinder
     * 
     * @return - the volume of the cylinder
     */
    public double volume() 
    {
        // calculate and store the volume of the cylinder
        double volume = Math.PI * radius * radius * height;
        
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
        String cylinder = "Cylinder with center at " + super.toString() 
                + ", a height of " + height + ", a radius of " + radius;
        
        return cylinder;
    }
}

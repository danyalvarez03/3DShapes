/*
 * File: Sphere.java
 * 
 * Programmer: Daniel A. Alvarez
 * 
 * I affirm that this class is entirely my own work 
 * and none of it is the work of anyone else.
 */

/** A class to implement a 3D sphere
 */
public class Sphere extends Shape3D
{
    private int radius; // the radius of the sphere
    
    
    /** Constructs a sphere object
     * 
     * @param x - x coordinate of the center
     * @param y - y coordinate of the center
     * @param z - z coordinate of the center
     */
    public Sphere(int x, int y, int z, int r)
    {
        super(x,y,z);   // call the superclass constructor
        radius = r;     // store the radius of the sphere
    }
    
    /** Calculates the surface area of the sphere
     * 
     * @return - the surface area of the sphere
     */
    public double surfaceArea() 
    {
        // calculate and store the surface area of the sphere
        double area = 4 * Math.PI * radius * radius;
        
        return area;
    }

    /** Calculates the volume
     * 
     * @return - the volume of the sphere
     */
    public double volume() 
    {
        // calculate and store the volume of the sphere
        double volume = (4 * Math.PI * radius * radius * radius) / 3;
        
        return volume; 
    }
    
    /** Write the information of the object in a string
     * 
     * @return - a string containing the shape, the center and the radius
     */
    public String toString()
    {
        // create the string and store it
        String sphere = "Sphere with center at " + super.toString() 
                + ", a radius of " + radius;
        
        return sphere;
    }
}

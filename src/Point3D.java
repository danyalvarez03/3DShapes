/*
 * File: Point3D.java
 * 
 * Programmer: Daniel A. Alvarez
 * 
 * I affirm that this class is entirely my own work 
 * and none of it is the work of anyone else.
 */

/** Implements a point in a 3D plane
 */
public class Point3D 
{
    private int x;      // x coordinate of the point
    private int y;      // y coordinate of the point
    private int z;      // z coordinate of the point
    
    /** Construct a Point3D object
     * 
     * @param x - x coordinate
     * @param y - y coordinate
     * @param z - z coordinate
     */
    public Point3D(int x, int y, int z)
    {
        // initialize all the instance variables
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /** Converts the coordinates into a string and returns it
     * 
     * @return - the string containing the coordinates of the point
     */
    public String toString()
    {
        // create the string and store it in coordinates
        String coordinates = "(" + x + "," + y + "," + z + ")";
        
        return coordinates;
    }
    
    /** Return the value on x coordinate
     * 
     * @return - the value on the x coordinate
     */
    public int getX()
    {
        return x;
    }
    
    /** Return the value on y coordinate
     * 
     * @return - the value on the y coordinate
     */
    public int getY()
    {
        return y;
    }
    
    /** Return the value on the z coordinate
     * 
     * @return - the value on the z coordinate
     */
    public int getZ()
    {
        return z;
    }
}

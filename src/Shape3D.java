/*
 * File: Shape3D.java
 * 
 * Programmer: Daniel A. Alvarez
 * 
 * I affirm that this class is entirely my own work 
 * and none of it is the work of anyone else.
 */

/** Implements a 3DShape from which other shapes can be derived
 */
public abstract class Shape3D implements Comparable
{
    // a point object that stores the center of the shape
    private Point3D center;
    
    /** Construct a 3D shape
     * 
     * @param x - x coordinate of the center point
     * @param y - y coordinate of the center point
     * @param z - z coordinate of the center point
     */
    public Shape3D(int x, int y, int z)
    {
        // initialize the center of the shape
        center = new Point3D(x,y,z);
    }
    
    /** Return the coordinates of the center as a string
     * 
     * @return - a string that represents the center of the shape
     */
    public String toString()
    {   
        return center.toString();
    }
    
    /** Calculate the distance from the center of the shape to the origin
     * 
     * @return - the distance from the origin
     */
    public double distanceFrom0()
    {
        int x = center.getX();   // store x coordinate
        int y = center.getY();   // store y coordinate
        int z = center.getZ();   // store z coordinate
        
        // calculate the distance in the xy plane
        double xyPythagorean = Math.sqrt(x * x + y * y);
        
        // calculate the total distance using the distance in xy
        double distance = Math.sqrt(xyPythagorean * xyPythagorean + z * z);
        
        return distance;
    }
    
    /** Calculate the surface area of the shape
     * 
     * @return - the surface are of the shape 
     */
    public abstract double surfaceArea();
    
    /** Calculate the volume of the shape
     * 
     * @return - the volume of the shape
     */
    public abstract double volume();
    
    /** Compare the sphere to another object in terms of volume
     * 
     * @param o - the object with which the sphere will be compared
     * @return - -1 if the implicit object comes before the explicit,
     *           0 if the objects are equal,
     *           and 1 if the implicit comes after the explicit
     */
    public int compareTo(Object o) 
    {
        double shapeVol = this.volume();  // store the volume of the sphere
        
        Shape3D other = (Shape3D) o;       // downcast object to a Shape3D
        double otherVol = other.volume();  // store the volume of the shape
        
        // check if shapeVol is less than otherVol
        if (shapeVol < otherVol)
            return -1;
        
        // check if shapeVol is greater than otherVol
        else if (shapeVol > otherVol)
            return 1;
        
        // triggers if otherVol and shapeVol are equal
        else 
            return 0;
    }
}

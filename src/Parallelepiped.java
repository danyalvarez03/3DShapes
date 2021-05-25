/*
 * File: Parallelepiped.java
 * 
 * Programmer: Daniel A. Alvarez
 * 
 * I affirm that this class is entirely my own work 
 * and none of it is the work of anyone else.
 */

/** A class to implement a parallelepiped 3D shape
 */
public class Parallelepiped extends Shape3D 
{
    private int length;      // length of the shape
    private int width;       // width of the shape
    private int height;      // height of the shape
    
    /** Constructs a parallelepiped 3D shape object
     * 
     * @param x - x coordinate of the center
     * @param y - y coordinate of the center
     * @param z - z coordinate of the center
     * @param l - length of the shape
     * @param w - width of the shape
     * @param h - height of the shape
     */
    public Parallelepiped(int x, int y, int z, int l, int w, int h) 
    {
        super(x, y, z);      // call the superclass constructor
        length = l;          // initialize the length
        width = w;           // initialize the width
        height = h;          // initialize the height
    }

    /** Calculate the surface area of the parallelepiped
     * 
     * @return - the surface area of the parallelepiped
     */
    public double surfaceArea() 
    {
        // calculate and store the surface area of the parallelepiped
        double area = 2 * length * width + 2 * length * height 
                + 2 * width * height;
        
        return area;
    }

    /** Calculate the volume of the parallelepiped
     * 
     * @return - the volume of the parallelepiped
     */
    public double volume() 
    {
        // calculate and store the volume of the parallelepiped
        double vol = length * width * height;
        
        return vol;
    }
    
    /** Write the information of the object in a string
     * 
     * @return - a string containing the shape, the center, the height,
     * the width, and the length
     */
    public String toString()
    {
        // create the string and store it
        String parallelepiped = "Parallelpiped with center at " 
                + super.toString() + ", a length of " + length + ", a width of " 
                + width + ", a height of " + height;
        
        return parallelepiped;
    }

}

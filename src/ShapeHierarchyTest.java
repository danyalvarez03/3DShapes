import java.util.Arrays;
import java.util.Comparator;

/*
 * File: ShapeHierarchyTest.java
 * 
 * Programmer: Daniel A. Alvarez
 * 
 * I affirm that this class is entirely my own work 
 * and none of it is the work of anyone else.
 */

/** A class that drives the 3D shape hierarchy
 */
public class ShapeHierarchyTest {

    /** Main method of the ShapeHierarchyTest class
     */
    public static void main(String[] args) 
    {
        // create an object of each shape
        Sphere sphere = new Sphere (8,5,2,14);
        Cone cone = new Cone (-1,4,-5,11,15);
        Cylinder cylinder = new Cylinder (5,-7,-35,14,12);
        Parallelepiped parallelepiped = new Parallelepiped (9,16,7,19,9,13);
        
        // create an array with the shapes
        Shape3D [] list = {sphere, cone, cylinder, parallelepiped};
        
        // print heading
        System.out.println("Output 1: Characteristics of each object\n");
        
        // iterate through the array
        for (int i = 0; i < list.length; i++)
        {
            // print the name, input data, and surface area of the shape
            System.out.println(list[i].toString() + ", and a surface area of " 
                    + list[i].surfaceArea());
        }
        
        Arrays.sort(list);      // sort the elements of the array
        
        // print heading
        System.out.println("\nOutput 2: Ascending List\n");
        
        // traverse the sorted list
        for (int i = 0; i < list.length; i++)
        {
            // print the class name and the volume
            System.out.println("Name: " + list[i].getClass().getSimpleName() 
                    + ", Volume: " + list[i].volume());
        }
        
        /** A class that implements the comparator interface
         */
        class Shape3DComparator implements Comparator
        {
            /** Override the method to compare two Shape3D objects
             *  by distance from the origin
             * 
             * @param o1 - the first Shape3D object to compare
             * @param o2 - the second shape3D object to compare
             * @return - 
             */
            public int compare(Object o1, Object o2) 
            {
                // downcast both objects to Shape3D objects
                Shape3D object1 = (Shape3D) o1;
                Shape3D object2 = (Shape3D) o2;
                
                // store the distance from the origin
                double distance1 = object1.distanceFrom0();
                double distance2 = object2.distanceFrom0();
                
                // check if distance1 is less than distance2
                if (distance1 < distance2)
                    return 1;
        
                // check if distance1 is greater than distance2
                else if (distance1 > distance2)
                    return -1;
               
                // triggers if distance1 and distance2 are equal
                else 
                    return 0;
            }
            
        }
        
        // create a Shape3DComparator object
        Shape3DComparator comp = new Shape3DComparator();
        
        Arrays.sort(list, comp);     // sort the array
        
        // print heading
        System.out.println("\nOutput 3: Descending List\n");
        
        // traverse the list
        for (int i = 0; i < list.length; i++)
        {
            // print the class name and the distance from the origin
            System.out.println("Name: " + list[i].getClass().getSimpleName() 
                    + ", Distance from the Origin: " + list[i].distanceFrom0());
        }
        
    }
}

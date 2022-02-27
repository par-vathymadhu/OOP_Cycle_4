/**Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides( ) that shows the number of sides in the given geometrical structures.**/

import java.util.*;

abstract class Shape 
{
    abstract void numberOfSides(); 
    public static void main(String args[])
    {
        Rectangle rec=new Rectangle();
        Triangle tri=new Triangle();
        Hexagon hex=new Hexagon();
        System.out.println("No. of sides: ");
        rec.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }   
}

class Rectangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("Rectangle: 4");
    }
}

class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("Triangle: 3");
    }

}

class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("Hexagon: 6");
    }
}


/**

Output:

No. of sides: 
Rectangle: 4
Trianngle: 3
Hexagon: 6

**/

/**Write a Java program to demonstrate the use of garbage collector.**/

import java.util.*;
import java.lang.*;

public class Cycle_4_qn_3 
{
    public static void main(String args[])
    {
        Cycle_4_qn_3 obj1=new Cycle_4_qn_3();
        Cycle_4_qn_3 obj2=new Cycle_4_qn_3();
        obj1=null;
        Cycle_4_qn_3 obj3=new Cycle_4_qn_3();
        obj2=obj3;
        new Cycle_4_qn_3();
        System.gc();

    }

    public void finalize()
    {
        System.out.println("Garbage collector operation");
    }
}

/**

Output:
Garbage collector operation 

**/

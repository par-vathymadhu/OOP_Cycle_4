/**Write two Java classes Employee and Engineer. Engineer should inherit from Employee class. Employee class to have two methods display() and calcSalary(). Write a program to display the engineer salary and to display from Employee class using a single object instantiation (i.e., only one object creation is allowed).
a. display() only prints the name of the class and does not return any value. Ex. “ Name of class is Employee.”
b. calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in Engineer displays “Salary of employee is 20000.”**/

import java.util.*;


class Employee
{
    void display()
    {
        System.out.println("Name of class is Employee");
    }

    void calcSalary()
    {
        System.out.println("Salary of employee is 10000");
    }
    public static void main(String args[])
    {
        Engineer obj=new Engineer();
        obj.display();
        obj.calcSalary();
    }
}

class Engineer extends Employee
{
    void display()
    {
        super.display();
        super.calcSalary();
        System.out.println("Name of class is Engineer");
    }
    void calcSalary()
    {
        System.out.println("Salary of employee is 20000");

    }
}

/**

Output:

Name of class is Employee
Salary of employee is 10000
Name of class is Engineer
Salary of employee is 20000
 
**/

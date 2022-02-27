/**Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named 'print-Salary( )'' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone
number, address and salary to an officer and a manager by making an object of both of these classes and print the same.**/

import java.util.*;

class Employee
{
    Scanner emp= new Scanner(System.in);
    String Name,Address_n,Address_st,Address_d,Address_s;
    int Age;
    long Phone_number;
    float Salary;
    public static void main(String args[])
    {
        Officer o=new Officer();
        Manager m=new Manager();
        o.read();
        System.out.println("\n-------------------------------------------");
        m.read();
        System.out.println("\n-------------------------------------------");
        o.print();
        System.out.println("\n-------------------------------------------");
        m.print();
    }
    void print_Salary()
    {
        System.out.println("Salary of the Employee:"+Salary);
    }
    void read()
    {
        System.out.println("Enter the following details: ");
        System.out.print("Name\t: ");
        this.Name=emp.next();
        System.out.print("Age\t: ");
        this.Age=emp.nextInt();
        System.out.print("Phone Number\t: ");
        this.Phone_number=emp.nextLong();
        System.out.println("Address\t: ");  
        System.out.print("House name: ");
        this.Address_n=emp.next();
        System.out.print("Street:");
        this.Address_st=emp.next();
        System.out.print("District:");
        this.Address_d=emp.next();
        System.out.print("State: ");
        this.Address_s=emp.next();
        System.out.print("Salary\t: ");
        this.Salary=emp.nextFloat();
    }

    void print()
    {
        System.out.println("Name\t: "+this.Name);
        System.out.println("Age\t: "+this.Age);
        System.out.println("Phone Number\t: "+this.Phone_number);
        System.out.println("Address\t: ");
        System.out.println("House name\t: "+this.Address_n);
        System.out.println("Street\t: "+this.Address_st);
        System.out.println("District\t: "+this.Address_d);
        System.out.println("State\t: "+this.Address_s);
        System.out.println("Salary\t: "+this.Salary);
    }


}

class Officer extends Employee
{
    String specialization; 
    void read()
    {
        System.out.println("*****Officer*****");
        super.read();
        System.out.print("Specialization: ");
        this.specialization=emp.next();
    }
    void print()
    {
        System.out.println("*****Officer*****");
        super.print();
        System.out.println("Specialization: "+this.specialization);
    }
}

class Manager extends Employee
{
    String department;
    void read()
    {
        System.out.println("*****Manager*****");
        super.read();
        System.out.print("Department: ");
        this.department=emp.next();
    }
    void print()
    {
        System.out.println("*****Manager*****");
        super.print();
        System.out.println("Department: "+this.department);
    }
}

/**

Output:

*****Officer*****
Enter the following details: 
Name    : Rachel
Age     : 26
Phone Number    : 9743452853
Address : 
House name: xyz      
Street: abc
District:Alappuzha
State: Kerala
Salary  : 50000
Specialization: App development

-------------------------------------------
*****Manager*****
Enter the following details:
Name    : Louis
Age     : 28
Phone Number    : 8563573524
Address : 
House name: xyz
Street:abc
District:Alappuzha
State: Kerala
Salary  : 60000
Department: Systems

-------------------------------------------
*****Officer*****
Name    : Rachel
Age     : 26
Phone Number    : 9743452853
Address :
House name      : xyz
Street  : abc
District        : Alappuzha
State   : Kerala
Salary  : 50000.0
Specialization: App

-------------------------------------------
*****Manager*****
Name    : Louis
Age     : 28
Phone Number    : 8563573524
Address :
House name      : xyz
Street  : abc
District        : Alappuzha
State   : Kerala
Salary  : 60000.0
Department: Systems

**/
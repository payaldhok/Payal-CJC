package D;

import A.*;
import B.*;
import c.*;
import java.util.Scanner;


    public class Data extends City {
    Scanner sc=new Scanner(System.in);
    public void setdata() {
    City c=new City();
    System.out.println("Enter city id");
    c.setId(sc.nextInt());
    System.out.println("Enter city name");
    c.setLocation(sc.next());
    System.out.println("Enter city name");
    c.setName(sc.next());
    
    Student s=new Student();
    System.out.println("Enter student id");
    s.setId(sc.nextInt());
    System.out.println("Enter student name");
    s.setName(sc.next());
    System.out.println("Enter student city name");
    s.setC(c);
    
    
    Employee e=new Employee();
    System.out.println("Enter employee id");
    e.setId(sc.nextInt());
    System.out.println("Enter employee name");
    e.setName(sc.next());
    System.out.println("Enter employee city name");
    e.setC(c);

}
	      
	}
	


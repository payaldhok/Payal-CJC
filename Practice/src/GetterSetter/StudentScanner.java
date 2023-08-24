package GetterSetter;

import java.util.Scanner;

public class StudentScanner {

	public static void main(String[] args) {
	Student student=new Student();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first rollno");
	student.setRollno(sc.nextInt());
	System.out.println("enter first name");
    student.setName(sc.next());
    
    Student s1=new Student();
    System.out.println("enter second id");
    s1.setRollno(sc.nextInt());
    System.out.println("enter second name");
	s1.setName(sc.next());
	
	System.out.println(student.getRollno());
	System.out.println(student.getName());
	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
	}

}

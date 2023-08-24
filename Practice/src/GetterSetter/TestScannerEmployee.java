package GetterSetter;

import java.util.Scanner;

public class TestScannerEmployee {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first id");
        employee.setId(scanner.nextInt());
        System.out.println("enter first name");
        employee.setName(scanner.next());
        System.out.println("enter first salary");
        employee.setSalary(scanner.nextFloat());
        
        Employee f=new Employee();
        System.out.println("entersecond id");
        f.setId(scanner.nextInt());
        System.out.println("enter second name");
        f.setName(scanner.next());
        System.out.println("enter second salary");
	     f.setSalary(scanner.nextFloat());
	     
	     System.out.println(employee.getId());
	     System.out.println(employee.getName());
	     System.out.println(employee.getSalary());
	     
	     System.out.println(f.getId());
	     System.out.println(f.getId());
	      System.out.println(f.getSalary());
	}

}

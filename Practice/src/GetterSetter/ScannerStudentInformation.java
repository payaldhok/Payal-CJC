package GetterSetter;

import java.util.Scanner;

public class ScannerStudentInformation {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	StudentInformation si=new StudentInformation();
	System.out.println("enter first id");
    si.setId(scanner.nextInt());
    System.out.println("enter name");
    si.setName(scanner.next());
    System.out.println("enter address");
    si.setAddress(scanner.next());
    System.out.println("enter hospital");
    si.setHospital(scanner.next());
    System.out.println("enter salary");
    si.setSalary(scanner.nextDouble());
    System.out.println("enter mobileno");
    si.setMobileno(scanner.nextLong());
     
    System.out.println(si.getId());
    System.out.println(si.getName());
    System.out.println(si.getAddress());
    System.out.println(si.getHospital());
    System.out.println(si.getSalary());
    System.out.println(si.getMobileno());
    
	}

}

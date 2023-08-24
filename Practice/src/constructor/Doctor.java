package constructor;

import java.util.Scanner;

//using local variable
//using this keyword
public class Doctor {

	int did;
	 String dname;
	 String daddr;          //globle declaring
	 String nhospital;
	 long mobileno;
	 double salary; 
	    
	public  Doctor(int did,String dname,String daddr,String nhospital, long mobileno){
		this.did=did;
		this.dname=dname;
		this.daddr=daddr;
		this.nhospital=nhospital;
		this.mobileno=mobileno;
		//this.salary=salary;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter did,dname,daddr,nhospital,mobileno");
		Doctor doctor=new Doctor(scanner.nextInt(),scanner.next(),scanner.next(),scanner.next(),scanner.nextLong());
		Doctor doctor1=new Doctor(13, "hii","uuuuuu", "choudhari",987654321l);
		Doctor doctor2=new Doctor(14, "bye","uuuuuuu", "ghandhi",7083041593l);
		Doctor doctor3=new Doctor(15, "byeeeee","uuuuuuu", "MGM",123455678898l);
		Doctor doctor4=new Doctor(16, "hiiiiiii","uuuuuuuuuu", "Dhnade",123455678898l);
		Doctor doctor5=new Doctor(17, "niceeee","uuuuuuuu", "ulhe",123455678898l);
		
		
		System.out.println(doctor.did);
		System.out.println(doctor.dname);
		System.out.println(doctor.daddr);
		System.out.println(doctor.nhospital);
		System.out.println(doctor.mobileno);
		
		
		
	}
}

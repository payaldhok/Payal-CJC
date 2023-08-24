package constructor;



//program using witout this keyword
public class Doctor1 {

	int did;
	 String dname;
	 String daddr;          //globle declaring
	 String nhospital;
	 long mobileno;
	// double salary; 
	 
	 public Doctor1(int e_did,String edname,String edaddr,String enhospital,long emobileno) {
		 int did=e_did;
		 String dname=edname;
		 String daddr=edaddr;
		 String nhospital=enhospital;
		 long mobileno=emobileno;
		// double salary=esalary;
		 
	 }
	 public static void main(String[] args) {
		 Doctor1 doctor1=new Doctor1(101,"payal","hello","orbit1",12356789l);
		// Doctor1 doctor2=new Doctor1(102,"paru","hii","orbit2",12356789000l,30.000d);
		 //Doctor1 doctor3=new Doctor1(103,"usha","by","orbit3",123567895555l,40.000d);
		 // doctor4=new Doctor1(104,"tushar","byeeee","orbit4",1235678955555l,50.000d);
		 //Doctor1 doctor5=new Doctor1(105,"parag","naaaaaaaa","orbit5",123567899999999l,60.000d);
		// Doctor1 doctor6=new Doctor1(106,"nanda","hiiiiii","orbit6",123567898888l,70.000d);
		 System.out.println(doctor1.dname);
		// System.out.println(doctor2.dname);
		// System.out.println(doctor3.daddr);
         //System.out.println(doctor4.mobileno);		 
		 //System.out.println(doctor1.salary);
		 
		 
		 
	}
	
}

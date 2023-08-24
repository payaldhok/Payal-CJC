package constructor;

public class Employee {

	int id;//11
	String name;//payal
	String department;//pune
	int salary;
	long mobNo;

	public Employee(int eid,String ename, String  depart, int esalary, long mbno)
	{
   id=eid;//11
   name=ename;
   department=depart;
	}
	public static void main(String[] args) 
	{
		Employee e=new Employee(11, "payal", "pune", 12345, 98745632);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.department);
	}

}

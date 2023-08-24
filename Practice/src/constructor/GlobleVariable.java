package constructor;

public class GlobleVariable {

	public static void main(String[] args) {
	Student student=new Student("payal", "shegav", 6555500, 43213456l);
	Employee e=new Employee(11, "payal", "pune", 12345, 98745632);
	System.out.println(e.id);
	System.out.println(e.name);
	System.out.println(e.department);
    System.out.println(student.name);
    System.out.println(student.location);
	System.out.println(student.turnOver);
	System.out.println(student.mobNo);
	}

}

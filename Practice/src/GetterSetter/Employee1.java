package GetterSetter;

public class Employee1 {

	public static void main(String[] args) {
		Employee e=new Employee();
		int s=e.set(100);
		e.setName("payal");
        e.setSalary(1000.0000f);
        
        Employee e1=new Employee();
        e1.Id(102);
        e1.setName("parag");
        e1.setSalary(20000.00000f);
        
        System.out.println(s);
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        
        System.out.println(e1.Id());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
	}

}

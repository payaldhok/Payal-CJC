package constructor;

public class Cons1 {
	String x;
	int y;
	float z;	
	
	public Cons1(String name, int id, float salary){
		this.x=name;
		this.y=id;
		this.z=salary;
		
		System.out.println("employee1= " +x+" "+y+" "+z);
		System.out.println("employee2= " +x+" "+y+" "+z);
	}
}

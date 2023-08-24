package constructor;

//import javax.swing.border.EmptyBorder;


public class Hello {
	
	String name;
	int Emp_Id;
	
	Hello(String name ,int Emp_Id){
		this.name=name;
		this.Emp_Id=Emp_Id;
	}
	public static void main(String[] args) {
		Hello hello=new Hello ("parag",101);
		System.out.println(hello.name+" "+hello.Emp_Id);

	}  

}

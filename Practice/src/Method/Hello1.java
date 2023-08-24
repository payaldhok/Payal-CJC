package Method;

public class Hello1 {

	public void m1(Hello hr) {
		System.out.println(hr.age);
		System.out.println(hr.name);
		System.out.println(hr.rollno);
	}
	public static void main(String[] args) {
	
       Hello hello=new Hello(43, "parag", 90);
       Hello1 hello1=new Hello1();
       hello1.m1(hello);
	}

}

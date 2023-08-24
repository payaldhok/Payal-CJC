package Method;

public class Student {
	int rollno;
	String name;
	int age;
	
	public void m1(int rollno,String name,int age) {
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student s=new Student();
  s.m1(1, "parag", 34);
	}

}

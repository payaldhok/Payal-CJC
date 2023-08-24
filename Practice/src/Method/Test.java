package Method;

//variable declare in student1 class
//in this progrm 
public class Test {
	public void m1(Student s) {//non premitive parameter
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test test=new Test();
      Student student=new Student();
      student.age=24;
      student.name="paysl";
      student.rollno=87;
      test.m1(student);
	}

}

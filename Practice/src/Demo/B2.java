package Demo;

public class B2 {
	
	
	public int add() {
		A1 a1=new A1();
		a1.x=100;
		a1.y=200;
		
		int c=a1.x+a1.y;
		System.out.println(c);
		return c;
	
	}

	public static void main(String[] args) {
	B2 b2=new B2();
	
	int v=b2.add();

	}

}

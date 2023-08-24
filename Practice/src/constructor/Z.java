package constructor;

public class Z {

	int x=10;
	int y=20;
	
	public Z() {
		int c=x+y;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Z z=new Z();

	}

}

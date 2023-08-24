package Demo;

public class B {
public void display(int x, int y) {
	int c =x+y;
	System.out.println(c);
}
	
	public static void main(String[] args) {
		B test=new B();
		test.display(200,300);
		//System.out.println(c);
	}
}

package Demo;

public class B3 {

	public int sub() {
		A3 a3 = new A3();
		a3.a = 300;
		a3.b = 400;
		int c = a3.a - a3.b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		B3 b3 = new B3();
		b3.sub();

	}

}

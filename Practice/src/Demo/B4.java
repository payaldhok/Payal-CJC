package Demo;

public class B4 {

	public float div() {
		A4 a4 = new A4();
		a4.x = 100.0f;
		a4.y = 25.0f;
		float c = a4.x /a4.y;
		System.out.println(c);

		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 b4 = new B4();
		b4.div();

	}

}

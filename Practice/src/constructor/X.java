package constructor;

import org.w3c.dom.ls.LSOutput;

public class X {
	int x=10;
	int y=20;
	
	public X() {
	int c=x*y;
	System.out.println(c);;
	}
	public static void main(String[] args) {
		X x=new X();

	}

}

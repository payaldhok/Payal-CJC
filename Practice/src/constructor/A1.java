package constructor;

import java.security.PublicKey;

public class A1 {

	public A1(double d,double f ) {
		double c=d+f;
		System.out.println(c);
	}
	public A1(int x,int y) {
	int c=x+y;
		System.out.println(c);
	}
	public A1(int x,float f) {
		int u=(int) (x+f);
		System.out.println(u);
	}
	public A1(int x,int y,int z) {
		int d=y+z;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		A1 a1=new A1(11.11,11.11);
		A1 a2=new A1(10,10);
		A1 a3=new A1(10,10.2f);
		A1 a4=new A1(10,20,30);
	}

}

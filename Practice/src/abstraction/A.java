package abstraction;

public class A implements I{
public void m1(){
	System.out.println("hello");
}

@Override
public int m2(int i, int j) {
	// TODO Auto-generated method stub
	
	System.out.println("hii");
	return 5;
}
}
 
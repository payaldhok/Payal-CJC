package constructor;

public class Sub {
	
	public Sub(int x,int y) {
		int c=x-y;
		System.out.println(c);
	}

	public static void main(String[] args) {
    Sub sub=new Sub(20, 10) ;

	}

}

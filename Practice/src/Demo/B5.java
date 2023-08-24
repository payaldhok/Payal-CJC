package Demo;

public class B5 {
	
	public float div(float x,float y) {
		A4 a4=new A4();
		a4.x=x;
		a4.y=y;
		float c=a4.x/a4.y;
		System.out.println(c);
		return c;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B5 b5=new B5();
      float s= b5.div(400.0f, 20.0f);
      System.out.println(s);
	}

}

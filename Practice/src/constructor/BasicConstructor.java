package constructor;

public class BasicConstructor {
	
	BasicConstructor(){
		System.out.println("this is constructor A");
	}

	public static void main(String[] args) {
		
		BasicConstructor V=new BasicConstructor();
		BasicConstructor V1=new BasicConstructor();
       //System.out.println("main method");
	}


}
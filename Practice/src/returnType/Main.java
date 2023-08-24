package returnType;

import java.util.Scanner;

public class Main {
   
	
	public void addition() {
		Hello h=new Hello();
		  h.x
		  h.y
		int c=h.x+h.y;
		   System.out.println(c);
		   Scanner scanner=new Scanner(System.in);
			System.out.println("enter first no");
			c =scanner.nextInt();
			System.out.println("enter second no");
			c =scanner.nextInt();
			
	}
	public static void main(String[] args) {
	Main main=new Main();
	main.addition();

	}

}

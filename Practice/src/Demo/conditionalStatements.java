package Demo;

import java.util.Scanner;

public class conditionalStatements {
	
	public void display() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.");
	    int result= sc.nextInt();
		

		if(result>0) {
			System.out.println("Given No. is Positive");
		}
		else {
			System.out.println("Given No. is Negative");
		}
	}
	
public static void main(String[] args) {
	conditionalStatements v=new conditionalStatements();
	v.display();
}
}

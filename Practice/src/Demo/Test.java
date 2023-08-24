package Demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Calculator cal=new Calculator();
		
		System.out.println("1 addition"+ "2:substraction"+"3:multiplication"+"4:division");
		
		
	while(true) {	
	
	System.out.println("Enter first Number");
	int a=sc.nextInt();
	System.out.println("Enter second Number");
	int b=sc.nextInt();
	
	
	int ch=sc.nextInt();
	if(ch==1) 
		cal.addition(a, b);
	
	else if(ch==2) 
		cal.substraction(a, b);
	
	else if(ch==3) 
		cal.multiplication(a, b);
	
	else if(ch==4) 
		cal.division(a, b);
	
	else {
		System.out.println("Invalid");
		}
	}
	}
}

package scanner;

import java.util.Scanner;

public class MainOperation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter First no");
        int sc=scanner.nextInt();
       System.out.println("enter second no");
       int sc1=scanner.nextInt();
       Calculator calculator=new Calculator();
       
       System.out.println("1:::addition"+"2:::subtraction"+"3::;multiplication"+"4:::division");
       int ch=scanner.nextInt();
       if(ch==1) 
       calculator.add(sc,sc1 );
       if(ch==2)
    	   calculator.sub(sc1, ch);
       if(ch==3)
    	   calculator.mult(sc1, ch);
       if(ch==4)
    	   calculator.div(sc1, ch);
       
 
	}

}

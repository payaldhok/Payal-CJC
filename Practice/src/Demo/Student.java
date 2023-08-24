package Demo;

import java.util.Scanner;

public class Student {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		
		int no=sc.nextInt();
		if(no>90)
			System.out.println("assined grade A");
		else if(no>75)
			System.out.println("assined grade b");
		
		else if(no>65)
			System.out.println("assined grade c");
		
		else if(no>45)
			System.out.println("assined grade d");
		
		else
			System.out.println("terminate");
	}

}

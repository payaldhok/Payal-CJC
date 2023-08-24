package Demo;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class First {



	public void sum(int a, int b) {
	
		int c= a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first no");
	    int a=scanner.nextInt();
		System.out.println("enter second no");
		int b=scanner.nextInt();
		First first = new First();
	    first.sum(a,b);
	}

}

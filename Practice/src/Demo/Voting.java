package Demo;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		
        int p=sc.nextInt();
    

     
       if(p>18) {
    	   System.out.println("eligible for voting");
    	   
       }
       else {
    	   System.out.println("not eligible");
       }

				

     

	}
}

package Method;

import java.util.Scanner;

public class Actor3 {

	public void m1(Actor2 act) {
		System.out.println(act.daddr);
		System.out.println(act.did);
		System.out.println(act.dname);
		System.out.println(act.mobileno);
		System.out.println(act.nhospital);
		System.out.println(act.salary);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter value daddr,did ,dname,mobileno,nhospital,salary");
	    Actor3 actor1=new Actor3();
	    
		Actor2 actor2=new Actor2();
        actor2.daddr=scanner.next();
        actor2.did=scanner.nextInt();
        actor2.daddr=scanner.next();
        actor2.mobileno=scanner.nextLong();
        actor2.nhospital=scanner.next();
        actor1.m1(actor2);
	}

}

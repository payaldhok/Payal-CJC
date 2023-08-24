package constructor;

import java.util.Scanner;

import javax.print.attribute.standard.MediaName;

public class Actor1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter aname,mobileno,dob,address,moviename");
		Actor actor=new Actor(sc.next(),sc.nextLong(),sc.next(),sc.next(),sc.next());
System.out.println(actor.aname + actor.mobileno+ actor.dob+ actor.address+ actor.moviename);
	}

}

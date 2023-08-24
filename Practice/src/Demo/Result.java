package Demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		bufferedreader br = new bufferedreader();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = sc.nextInt();
		
		
	int percentage=(marks/400)*100;
		
		if (percentage>75) {
			System.out.println("Distinction, percentage = "+ percentage);
		}
		else if (75>percentage && percentage>60) {
			System.out.println("Grade A, percentage = "+percentage);
		}
		else if (60>percentage && percentage>45) {
			System.out.println("Grade B, percentage = "+percentage);
		}
		else if (45>percentage && percentage>35) {
			System.out.println("Grade D, percentage = "+percentage);
		}
		else {
			System.out.println("Fail "+percentage);
		}

		Grading g = new Grading();
		g.grade(marks);

	}

}
